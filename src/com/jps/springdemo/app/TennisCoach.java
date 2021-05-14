package com.jps.springdemo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	//Create a constructor in your class for injections
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		
		this.fortuneService = theFortuneService;
	
	}
	
	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley!";
		
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();

	}
	
}
