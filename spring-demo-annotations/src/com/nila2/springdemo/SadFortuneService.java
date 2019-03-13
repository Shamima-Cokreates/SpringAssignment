package com.nila2.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is sadfortune";
	}

}
