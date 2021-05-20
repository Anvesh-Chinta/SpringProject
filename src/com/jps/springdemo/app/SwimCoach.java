package com.jps.springdemo.app;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	//dependency injection - using constructor method
	private FortuneService fortuneService;
	
	@Value("${olympics.email}")
	private String email;
	
	@Value("${olympics.team}")
	private String team;
	
	
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

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}	

}
