package com.jps.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jps.springdemo.app.Coach;
import com.jps.springdemo.app.SwimCoach;

@Configuration
@ComponentScan("com.jps.springdemo")
public class SportConfig {
	
	//define bean for our swim coach 
	@Bean
	public Coach swimCoach() {
		
		return new SwimCoach(null);
		
	}
	
}
