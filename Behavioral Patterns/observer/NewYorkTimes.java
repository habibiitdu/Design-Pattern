package com.designPattern.observer;

import java.util.ArrayList;

public class NewYorkTimes implements Observer{
	public ArrayList<Observable> subscribers = new ArrayList<Observable>(); 
	public String news; 

	@Override
	public void addOvervable(Observable observeable) {
		subscribers.add(observeable); 
		System.out.println("Subscriber added : "+ observeable.getName());
	}

	@Override
	public void removeOvervable(Observable observeable) {
		subscribers.remove(observeable); 
		System.out.println("Subscriber removed : "+ observeable.getName());
	}

	@Override
	public void notifyObservers() {
		for (Observable subscriber : subscribers) {
			subscriber.update(news);
		}
	}

	@Override
	public void addNews(String news) {
			this.news = news; 	
			notifyObservers(); 
	}
}
