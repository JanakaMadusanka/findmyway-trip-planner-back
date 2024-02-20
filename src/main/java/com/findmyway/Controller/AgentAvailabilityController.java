package com.findmyway.Controller;

import com.findmyway.Dto.AgentAvailabilityDto;
import com.findmyway.Entity.AgentAvailabilityEntity;
import com.findmyway.Service.AgentAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Dictionary;

@RestController
@CrossOrigin
public class AgentAvailabilityController {
    @Autowired
    AgentAvailabilityService service;

    @PostMapping("/set/time")
    public void setTimeSlot(@RequestBody AgentAvailabilityDto availability) {
        service.setTimeSlot(availability);
    }

    @GetMapping("/get-time-all")
    public Iterable<AgentAvailabilityEntity> getAllTimeSlot(){
        return service.getAllTimeSlot();
    }




}
