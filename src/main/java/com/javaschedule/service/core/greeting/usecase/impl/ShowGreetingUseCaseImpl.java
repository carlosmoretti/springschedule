package com.javaschedule.service.core.greeting.usecase.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaschedule.service.core.greeting.Greeting;
import com.javaschedule.service.core.greeting.ports.GreetingService;
import com.javaschedule.service.core.greeting.usecase.ShowGreetingUseCase;

@Component
public class ShowGreetingUseCaseImpl implements ShowGreetingUseCase {
	
	@Autowired
	GreetingService service;

	@Override
	public Greeting getGreetingMessage() {
		// TODO Auto-generated method stub
		return service.createGreeting("Olá Mundo!");
	}
}
