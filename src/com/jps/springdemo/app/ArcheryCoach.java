package com.jps.springdemo.app;

import org.springframework.stereotype.Component;

@Component
public class ArcheryCoach implements Coach {

	
	@Override
	public String getDailyWorkout() {
		
		return "One-arm Dumbbell Lateral Raises";
	}

	@Override
	public String getDailyFortune() {
		
		return null;
	}

}
