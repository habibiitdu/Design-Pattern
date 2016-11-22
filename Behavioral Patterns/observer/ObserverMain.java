package com.designPattern.observer;

public class ObserverMain {
	public static void main (String args[]){
		Subscriber abCompany = new Subscriber("AB Company"); 
		Subscriber psCompany = new Subscriber("PS Company"); 
		Subscriber rdCompany = new Subscriber("RD Company");
		
		Company newYorkTimes = new Company("NY Times"); 
		Company facebook = new Company("Facebook"); 
		
		newYorkTimes.addOvervable(abCompany);
		newYorkTimes.addOvervable(psCompany);
		newYorkTimes.addOvervable(rdCompany);
		facebook.addOvervable(rdCompany);
		facebook.addOvervable(psCompany);
		
		newYorkTimes.addNews("US Election");
		facebook.addNews("Facebook University launched");
		
		newYorkTimes.removeOvervable(psCompany);
		
		newYorkTimes.addNews("US Presidential Debate");
		facebook.addNews("Facebook UI Changed");
	}
}
