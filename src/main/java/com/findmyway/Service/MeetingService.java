package com.findmyway.Service;


import com.findmyway.Dto.MeetingDto;
import com.findmyway.Entity.AgentAvailabilityEntity;
import com.findmyway.Entity.MeetingEntity;

public interface MeetingService {
    void createMeeting(MeetingDto meetingDto);
    Iterable<MeetingEntity> getAllMeeting();

    MeetingDto getMeetingById(Long id);

}
