package com.findmyway.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MeetingDto {
    private Long meetingId;
    private String firstName;
    private String lastName;
    private String contact;
    private String email;
    private String date;
    private String time;
    private String medium;
    private String token;
    private String agentId;
}
