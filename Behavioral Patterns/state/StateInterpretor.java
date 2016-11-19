package com.designPattern.state;

public class StateInterpretor {
	public static void main(String args[]){
		SeasonContext seasonCon = new SeasonContext(); 
		seasonCon.nextSeason();
		seasonCon.nextSeason();
		seasonCon.nextSeason();
		
		System.out.println("------------");
		seasonCon.setSeason(new Winter());
		seasonCon.nextSeason();
		seasonCon.nextSeason();
	}
}
