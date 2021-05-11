package com.javaschedule.service.infrastructure.convert.impl;

import org.springframework.stereotype.Component;

import com.javaschedule.service.core.greeting.Greeting;
import com.javaschedule.service.infrastructure.convert.GreetingMapper;
import com.javaschedule.service.infrastructure.dto.GreetingDto;

@Component
public class GreetingMapperImpl implements GreetingMapper {
	
	@Override
	public GreetingDto modelToDto(Greeting model) {
		return new GreetingDto(model.getGreeting());
	}

	@Override
	public Greeting dtoToModel(GreetingDto dto) {
		return new Greeting(dto.getMessage());
	}

}
