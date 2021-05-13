package com.jps.springdemo;

import com.jps.springdemo.service.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket Coach: Inside no-arg constructor");
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Three rounds followed by net practice!";
		
	}

	@Override
	public String getDailyFortune() {
		
		return "Your team shall win the match!";
	}

}
