//Changing variable reference to use Interface
package com.nila2.springdemo;

public class MyApp {
	public static void main(String[] args) {
		Coach theCoach= new TrackCoach(); // create object		
		System.out.println(theCoach.getDailyWorkOut());// use object
	}
}
