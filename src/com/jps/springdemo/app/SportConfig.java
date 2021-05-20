package com.jps.springdemo.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SportConfig{
	
	@Bean
	public FortuneService seriousFortuneService() {
		
		return new SeriousFortuneService();
				
	}
	
	@Bean
	public Coach archeryCoach() {
		
		return new ArcheryCoach(seriousFortuneService());
		
	}
}