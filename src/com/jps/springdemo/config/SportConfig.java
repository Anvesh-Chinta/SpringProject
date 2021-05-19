package com.jps.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jps.springdemo.app.Coach;
import com.jps.springdemo.app.FortuneService;
import com.jps.springdemo.app.SadFortuneService;
import com.jps.springdemo.app.SwimCoach;

@Configuration
@ComponentScan("com.jps.springdemo")
public class SportConfig {

	//define bean  for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		
		return new SadFortuneService();
		
	}
	
	//define bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		
		return new SwimCoach(null);
		
	}
	
}
