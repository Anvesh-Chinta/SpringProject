package com.jps.springdemo;

import com.jps.springdemo.service.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	//generated using shortcut(Right click->source->generateConstructor using fields)
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run for your Life";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

}
