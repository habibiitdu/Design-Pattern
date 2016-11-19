package com.designPattern.bridge;

public class ModifiedInterviewImp implements ModifiedInterview{
	
	Interview interview = null; 
	
	public ModifiedInterviewImp(Interview interview){
		this.interview = interview; 
	}

	@Override
	public void vivaVoce() {
		interview.vivavoce();		
	}

	@Override
	public void labTest() {
		interview.labTest();		
	}
	
	@Override
	public void writtenTest() {
		interview.writtenTest();
		
	}

	@Override
	public void ReviewCV() {
		System.out.println("Reviwing CV for the candidate");
	}

	@Override
	public void technicalVivaVoce() {
		System.out.println("Performing Technical Interview for the Candidate");
	}

	@Override
	public void businesslevelInterview() {
		System.out.println("Performing Business Interview for the Candidate");
	}

	@Override
	public void toplevelInterview() {
		System.out.println("Performing top level Interview for the Candidate");
	}	
}
