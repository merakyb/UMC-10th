package com.example.umc10th.domain.review.controller;

import com.example.umc10th.domain.review.dto.ReviewReqDTO;
import com.example.umc10th.global.apiPayload.ApiResponse;
import com.example.umc10th.global.apiPayload.code.GeneralSuccessCode;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/missions/{missionId}/reviews")
public class ReviewController {

    @PostMapping
    public ApiResponse<String> createReview(
            @RequestHeader("Authorization") String authorization,
            @PathVariable Long missionId,
            @RequestBody ReviewReqDTO.CreateReviewDTO request
    ) {
        return ApiResponse.onSuccess(GeneralSuccessCode.OK, "리뷰 작성 성공");
    }
}
