package com.javaschedule.service.core.greeting.ports;

import com.javaschedule.service.core.greeting.Greeting;

public interface GreetingService {
	Greeting createGreeting(String message);
}
