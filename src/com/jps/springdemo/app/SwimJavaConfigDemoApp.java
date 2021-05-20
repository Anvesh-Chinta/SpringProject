package com.jps.springdemo.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get bean from Spring container - default bean id
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call the method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//call our new swim coach methods... which have properties value injected
		System.out.println("\nemail: " + theCoach.getEmail());
		
		System.out.println("\nteam: " + theCoach.getTeam());

		// close the context
		context.close();

	}

}
