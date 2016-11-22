package com.designPattern.observer;

import java.util.ArrayList;

public class Company implements Observer{
	public ArrayList<Observable> subscribers = new ArrayList<Observable>(); 
	public String news; 
	public String name; 
	
	public Company(String name){
		this.name = name; 
	}

	@Override
	public void addOvervable(Observable observeable) {
		subscribers.add(observeable); 
		System.out.println(this.name +" Subscriber added : "+ observeable.getName());
	}

	@Override
	public void removeOvervable(Observable observeable) {
		subscribers.remove(observeable); 
		System.out.println(this.name +  "Subscriber removed : "+ observeable.getName());
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
