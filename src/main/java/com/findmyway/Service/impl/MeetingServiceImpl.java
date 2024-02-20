package com.findmyway.Service.impl;

import com.findmyway.Dto.MeetingDto;
import com.findmyway.Entity.AgentAvailabilityEntity;
import com.findmyway.Entity.MeetingEntity;
import com.findmyway.Repository.AgentAvailabilityRepository;
import com.findmyway.Repository.MeetingRepository;
import com.findmyway.Service.MeetingService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class MeetingServiceImpl implements MeetingService {
    @Autowired
    MeetingRepository repository;
    AgentAvailabilityRepository agentAvailabilityRepository;

    ModelMapper mapper;
    @Bean
    public void setup(){
        this.mapper = new ModelMapper();
    }
    @Override
    public void createMeeting(MeetingDto meetingDto) {
        MeetingEntity entity = mapper.map(meetingDto,MeetingEntity.class);
        repository.save(entity);
    }

    @Override
    public Iterable<MeetingEntity> getAllMeeting() {
        return repository.findAll();
    }

    @Override
    public MeetingDto getMeetingById(Long id) {
        MeetingDto dto = mapper.map(repository.findById(id),MeetingDto.class);
        return dto;
    }

}
