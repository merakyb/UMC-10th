package com.example.umc10th.domain.mission.dto;

import java.time.LocalDateTime;

public class MissionReqDTO {

    public record CreateMission(
            LocalDateTime deadline,
            Long point,
            String conditional
    ) {}
}
