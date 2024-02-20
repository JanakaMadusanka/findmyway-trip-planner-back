package com.findmyway.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name="meeting")
public class MeetingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
