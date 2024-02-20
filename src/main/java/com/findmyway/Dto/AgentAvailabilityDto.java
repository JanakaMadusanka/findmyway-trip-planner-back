package com.findmyway.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AgentAvailabilityDto {
    private String userId;
    private String date;
    private String timeFrom;
    private String timeTo;
}
