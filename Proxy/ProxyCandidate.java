package com.designPattern.Proxy;

public class ProxyCandidate implements Candidate{
	private RealCandidate realCandidate;
	@Override
	public void attendExam() {
		if(realCandidate==null){
			realCandidate = new RealCandidate(); 
		}
		realCandidate.attendExam();
	}
}
