package com.example.umc10th.domain.user.controller;

import com.example.umc10th.domain.user.dto.UserReqDTO;
import com.example.umc10th.domain.user.dto.UserResDTO;
import com.example.umc10th.global.apiPayload.ApiResponse;
import com.example.umc10th.global.apiPayload.code.GeneralSuccessCode;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    @PostMapping("/signup")
    public ApiResponse<UserResDTO.SignUpResultDTO> signUp(
            @RequestBody UserReqDTO.SignUpDTO request
    ) {
        UserResDTO.SignUpResultDTO result =
                new UserResDTO.SignUpResultDTO(1L, request.nickname());

        return ApiResponse.onSuccess(GeneralSuccessCode.OK, result);
    }

}
