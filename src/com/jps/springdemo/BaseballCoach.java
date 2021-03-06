package com.jps.springdemo;

import com.jps.springdemo.service.FortuneService;

public class BaseballCoach implements Coach{

	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//constructor for dependency infection
	public BaseballCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
		
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Spend 30 minutes on batting practice";
		
	}

	@Override
	public String getDailyFortune() {
		
		//use my fotune service to get a fortune
		return fortuneService.getFortune();
		
	}
	
}
