package com.jps.springdemo;

import com.jps.springdemo.service.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket Coach: Inside no-arg constructor");
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	//We generally need setters but we are using getters to print the value here...

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
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
