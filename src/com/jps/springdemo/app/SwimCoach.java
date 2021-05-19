package com.jps.springdemo.app;

public class SwimCoach implements Coach {

	//dependency injection - using constructor method
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		
		this.fortuneService = theFortuneService;
	
	}

	@Override
	public String getDailyWorkout() {

		return "2 x 50m swim freestyle (front crawl) – 30 seconds rest (after each round)";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
		
	}

}
