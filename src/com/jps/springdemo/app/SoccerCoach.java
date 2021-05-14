package com.jps.springdemo.app;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
	//define a default constructor
	public SoccerCoach() {
		System.out.println(">>TennisCoach: inside default constructor");
	}
	
	//define a setter method
	public void setFortuneService(FortuneService fortuneService) {
	
		this.fortuneService = fortuneService;
	
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Cone weave to Zigzag weave - both feet\n 4 Sets - 10-15 Reps";
	
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
		
	}

}
