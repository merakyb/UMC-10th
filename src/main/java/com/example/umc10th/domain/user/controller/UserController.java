package com.example.umc10th.domain.user.controller;

import com.example.umc10th.domain.user.dto.UserReqDTO;
import com.example.umc10th.domain.user.dto.UserResDTO;
import com.example.umc10th.domain.user.entity.User;
import com.example.umc10th.domain.user.exception.UserSuccessCode;
import com.example.umc10th.domain.user.service.UserService;
import com.example.umc10th.global.apiPayload.ApiResponse;
import com.example.umc10th.global.apiPayload.code.GeneralSuccessSuccessCode;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/signup")
    public ApiResponse<UserResDTO.SignUpResultDTO> signUp(
            @RequestBody UserReqDTO.SignUpDTO request
    ) {
        return ApiResponse.onSuccess(UserSuccessCode.SIGNUP_SUCCESS,userService.signUp(request));
    }

    @PostMapping("/login")
    public ApiResponse<UserResDTO.LoginResultDTO> login(
            @RequestBody UserReqDTO.LoginDTO request
    ) {
        return ApiResponse.onSuccess(UserSuccessCode.LOGIN_SUCCESS,userService.login(request));
    }

    @GetMapping("/mypage/{userId}")
    public ApiResponse<UserResDTO.MyPageDTO> getMyPage(
            @PathVariable Long userId
    ) {
        UserResDTO.MyPageDTO result = userService.getMyPage(userId);

        return ApiResponse.onSuccess(GeneralSuccessSuccessCode.OK, result);
    }

}
