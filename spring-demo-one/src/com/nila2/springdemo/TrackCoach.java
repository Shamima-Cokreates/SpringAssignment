package com.nila2.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	//add init method
	public void initMethod() {
		System.out.println("TrackCoach: inside initMethod ");
	}
	//add destroy method
	public void destroyMethod() {
		System.out.println("TrackCoach: inside destroyMethod ");
	}
	
	

}










