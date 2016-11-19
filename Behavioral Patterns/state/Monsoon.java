package com.designPattern.state;

public class Monsoon implements Season{

	@Override
	public void nextSeason(SeasonContext seasonContext) {
		System.out.println("Monsoon season is going on......");
		seasonContext.setSeason(new Winter());
	}

}
