package com.jakir;

public class MyApp {

	public static void main(String[] args) {
		
		// create the object
		Coach theCoach = new TrackerCoach();
		
		// use the object 
		System.out.println(theCoach.getDailyWorkout());
	}

}
