package com.jakir;

public class TrackCoach implements Coach {

	private FortuneService FortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.FortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + FortuneService.getFortune();
	}

}
