package com.springinpractice.ch13.helpdesk.integration.transformer;

import org.springframework.stereotype.Component;

import com.springinpractice.ch13.cdm.TicketStatus;
import com.springinpractice.ch13.helpdesk.model.TicketStatusEntity;

@Component
public class TicketStatusTransformer {
	
	public TicketStatus toDto(TicketStatusEntity statusEntity) {
		TicketStatus statusDto = new TicketStatus();
		statusDto.setId(statusEntity.getId());
		statusDto.setKey(statusEntity.getKey());
		statusDto.setName(statusEntity.getName());
		return statusDto;
	}
	
	public TicketStatusEntity toEntity(TicketStatus statusDto) {
		TicketStatusEntity statusEntity = new TicketStatusEntity();
		statusEntity.setId(statusDto.getId());
		statusEntity.setKey(statusDto.getKey());
		statusEntity.setName(statusDto.getName());
		return statusEntity;
	}
}
