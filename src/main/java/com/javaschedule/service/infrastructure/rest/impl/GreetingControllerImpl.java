package com.javaschedule.service.infrastructure.rest.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaschedule.service.core.greeting.usecase.ShowGreetingUseCase;
import com.javaschedule.service.infrastructure.convert.GreetingMapper;
import com.javaschedule.service.infrastructure.dto.GreetingDto;
import com.javaschedule.service.infrastructure.rest.GreetingController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingControllerImpl implements GreetingController {
	
	@Autowired
	ShowGreetingUseCase showGreetingUseCase;
	
	@Autowired
	GreetingMapper mapper;

	@Override
	@GetMapping()
	public GreetingDto greeting() {
		// TODO Auto-generated method stub
		return mapper.modelToDto(showGreetingUseCase.getGreetingMessage());
	}
}
