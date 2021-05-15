package com.jps.springdemo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	//define a default constructor
	public SoccerCoach() {
		System.out.println(">>soccerCoach: inside default constructor");
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
