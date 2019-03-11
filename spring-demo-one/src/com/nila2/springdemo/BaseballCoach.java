package com.nila2.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	//add a new field for email address and team 
	private String emailAddress;
	private String team;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	//Create a no-arg constructor
	public BaseballCoach() {
		System.out.println("BaseballCoach:inside no-arg constructor");
	}
//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("BaseballCoach:inside setter method -set FortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
