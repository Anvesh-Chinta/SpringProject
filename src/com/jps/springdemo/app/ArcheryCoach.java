package com.jps.springdemo.app;

import org.springframework.stereotype.Component;

@Component
public class ArcheryCoach implements Coach {

	private FortuneService fortuneService;
	
	public ArcheryCoach(FortuneService theFortuneService) {

		this.fortuneService = theFortuneService;
		
	}

	@Override
	public String getDailyWorkout() {
		
		return "One-arm Dumbbell Lateral Raises";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
		
	}

}
