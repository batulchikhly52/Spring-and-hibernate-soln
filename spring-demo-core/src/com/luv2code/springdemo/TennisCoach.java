package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

//	@Autowired
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("In Default Constructor");
	}
	
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In Set FortuneService");
		this.fortuneService = fortuneService;
	}

	@component
//	@PostConstruct
//	public void Pconst(){
//		System.out.println("Post Construct");
//	}

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
