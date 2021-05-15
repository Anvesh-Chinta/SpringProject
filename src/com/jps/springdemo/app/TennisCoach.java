package com.jps.springdemo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	// Create a constructor in your class for injections
	public TennisCoach() {
		
		System.out.println(">>TennisCoach: default constructor");
	
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
