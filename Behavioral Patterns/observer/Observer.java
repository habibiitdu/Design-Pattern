package com.designPattern.observer;

public interface Observer {
	public void addOvervable(Observable ovserveable); 
	public void removeOvervable(Observable ovserveable);
	public void notifyObservers(); 
	public void addNews(String news); 
}
