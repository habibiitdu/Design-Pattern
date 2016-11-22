package com.designPattern.observer;

public class ObserverMain {
	public static void main (String args[]){
		Observable abCompnay = new ABCompany(); 		
		Observable psCompany = new PSCompany(); 
		Observer newYorkTimes = new NewYorkTimes();
		newYorkTimes.addOvervable(abCompnay);
		newYorkTimes.addOvervable(psCompany);
		newYorkTimes.addNews("Explotion in Pakistan");
		newYorkTimes.removeOvervable(psCompany);
		newYorkTimes.addNews("Torture on rohingya in mayanmar");
	}
}
