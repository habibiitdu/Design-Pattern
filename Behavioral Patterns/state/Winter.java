package com.designPattern.state;

public class Winter implements Season{

	@Override
	public void nextSeason(SeasonContext seasonContext) {
		System.out.println("Winter season is going on......");
		seasonContext.setSeason(new Summer());
	}

}
