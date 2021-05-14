package com.jps.springdemo.app;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Travel is in your future.";
		
	}

}
