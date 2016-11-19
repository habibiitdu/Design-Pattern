package com.designPattern.bridge;

public class SeniorSoftwareEngineerInterview implements Interview{

	@Override
	public void writtenTest() {
		System.out.println("Performing written Test for Senior Software Engineer Interview");
	}

	@Override
	public void vivavoce() {
		System.out.println("Performing viva Voce for Senior Software Engineer Interview");
	}

	@Override
	public void labTest() {
		System.out.println("Performing lab test for Senior Software Engineer Interview");
	}

}
