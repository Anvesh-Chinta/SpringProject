package com.jps.springdemo.app;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("RESTFortuneService")
	private FortuneService fortuneService;

	// Create a constructor in your class for injections
	public TennisCoach() {
		
		System.out.println(">>TennisCoach: default constructor");
	
	}
	
	//define my init method
	@PostConstruct
	public void myStartUp() {
		
		System.out.println(">>TennisCoach: inside myStartUp method");
	
	}
	
	//define my destroy method
	@PreDestroy
	public void myCleanUp() {
		
		System.out.println(">>TennisCoach: inside myCleanUp method");
		
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
