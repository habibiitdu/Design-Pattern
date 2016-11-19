package com.designPattern.bridge;

public class BridgeInterpretor {
	public static void main(String args[]){
		JnrSoftwareEngineerInterview jnSEInterview = new JnrSoftwareEngineerInterview(); 
		System.out.println("Processing Interview for Junior software Engineer");
		ModifiedInterviewImp modifiedInterview = new ModifiedInterviewImp(jnSEInterview); 
		modifiedInterview.vivaVoce();
		modifiedInterview.labTest();
		modifiedInterview = new ModifiedInterviewImp(new SeniorSoftwareEngineerInterview()); 
		System.out.println("Processing Interview for Senior software Engineer");
		modifiedInterview.ReviewCV();
		modifiedInterview.writtenTest();
		modifiedInterview.vivaVoce();
		modifiedInterview.businesslevelInterview();
		modifiedInterview.technicalVivaVoce();
	}
}
