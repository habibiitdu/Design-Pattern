package com.designPattern.state;

public class Summer implements Season{

	@Override
	public void nextSeason(SeasonContext seasonContext) {
		System.out.println("Summer season is going on......");
		seasonContext.setSeason(new Monsoon());
	}

}
