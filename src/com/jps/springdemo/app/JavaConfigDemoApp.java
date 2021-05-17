package com.jps.springdemo.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get bean from Spring container - default bean id
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call the method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}
