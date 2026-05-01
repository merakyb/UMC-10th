package com.example.umc10th.domain.mission.dto;

public class MissionResDTO {

    public record MissionListDTO(
            Long regionId,
            String status,
            Integer page,
            Integer size
    ) {}

    public record MissionDetailDTO(
            Long missionId,
            String message
    ) {}
}
