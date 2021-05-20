package com.jps.springdemo.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.jps.springdemo")
public class SportConfig {

	//define bean  for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		
		return new SadFortuneService();
		
	}
	
	//define bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		
		return new SwimCoach(sadFortuneService());
		
	}
	
}
