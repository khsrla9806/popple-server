package com.popple.server.domain.event.dto;

import com.popple.server.domain.entity.Event;
import com.popple.server.domain.entity.Seller;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;

@AllArgsConstructor
@Builder
@Getter
public class EventRespDto {

    private Long id;
    private String name;
    private Seller host;
    private String location;
    private String description;
    private String thumbnailUrl;
    private Timestamp startDate;
    private Timestamp endDate;

    public static EventRespDto fromEntity(Event event){
        return EventRespDto.builder()
                .id(event.getId())
                .name(event.getName())
                .host(event.getHost())
                .location(event.getLocation())
                .description(event.getDescription())
                .thumbnailUrl(event.getThumbnailUrl())
                .startDate(event.getStartDate())
                .endDate(event.getEndDate())
                .build();
    }

}