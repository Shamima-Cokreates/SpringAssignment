package com.nila2.springdemo;

public  class CricketCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	public String getDailyFortune() {		
		// use my fortuneService to get a fortune		
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return null;
	}



	
}








