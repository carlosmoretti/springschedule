package com.javaschedule.service.infrastructure.service;

import org.springframework.stereotype.Service;

import com.javaschedule.service.core.greeting.Greeting;
import com.javaschedule.service.core.greeting.ports.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {
	@Override
	public Greeting createGreeting(String message) {
		// TODO Auto-generated method stub
		return new Greeting("Olá Mundo!");
	}
}
