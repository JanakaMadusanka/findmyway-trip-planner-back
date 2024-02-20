package com.findmyway.Controller;

import com.findmyway.Dto.MeetingDto;
import com.findmyway.Entity.AgentAvailabilityEntity;
import com.findmyway.Entity.MeetingEntity;
import com.findmyway.Service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/meeting")
@RestController
@CrossOrigin
public class MeetingController {
    @Autowired
    MeetingService service;

    @PostMapping("create")
    public void createMeeting(@RequestBody MeetingDto meetingDto) {
        service.createMeeting(meetingDto);
    }
    @GetMapping("/get/all")
    public Iterable<MeetingEntity> getAllMeeting(){
        return service.getAllMeeting();
    }

    @GetMapping("/get/{id}")
    public MeetingDto getMeetingById(@PathVariable Long id){
        return service.getMeetingById(id);
    }

}
