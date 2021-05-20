package com.jps.springdemo.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ArcheryJavaConfigDemoApp{
	
	public static void main(String[] args) {
		
		//load the spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve bean from spring container
		ArcheryCoach theCoach = context.getBean("archeryCoach", ArcheryCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		
	}
	
}