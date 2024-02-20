package com.findmyway.Service.impl;
import com.findmyway.Dto.AgentAvailabilityDto;
import com.findmyway.Entity.AgentAvailabilityEntity;
import com.findmyway.Repository.AgentAvailabilityRepository;
import com.findmyway.Service.AgentAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentAvailabilityServiceImpl implements AgentAvailabilityService {
    @Autowired
    AgentAvailabilityRepository repository;
    @Override
    public void setTimeSlot(AgentAvailabilityDto availability) {
        AgentAvailabilityEntity entity = new AgentAvailabilityEntity();
        entity.setUserId(availability.getUserId());
        entity.setDate(availability.getDate());
        entity.setTimeFrom(availability.getTimeFrom());
        entity.setTimeTo(availability.getTimeTo());

        repository.save(entity);
    }
    @Override
    public Iterable<AgentAvailabilityEntity> getAllTimeSlot() {
        return repository.findAll();
    }


}
