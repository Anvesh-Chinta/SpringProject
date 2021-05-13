package com.jps.springdemo;

public class MyApp {

	//Rough prototype: Traditional approach
	public static void main(String[] args) {
		
		//create the object
		Coach theCoach = new TrackCoach();
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());
	}
}
