package com.findmyway.Service;


import com.findmyway.Dto.AgentAvailabilityDto;
import com.findmyway.Entity.AgentAvailabilityEntity;

public interface AgentAvailabilityService {
    void setTimeSlot(AgentAvailabilityDto agentAvailabilityDto);
    Iterable<AgentAvailabilityEntity> getAllTimeSlot();
}
