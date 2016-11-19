package com.designPattern.bridge;

public class JnrSoftwareEngineerInterview implements Interview
{

	@Override
	public void writtenTest() {
		System.out.println("Performing written Test for Junior Software Engineer Interview");
	}

	@Override
	public void vivavoce() {
		System.out.println("Performing viva Voce for Junior Software Engineer Interview");
	}

	@Override
	public void labTest() {
		System.out.println("Performing lab test for Junior Software Engineer Interview");
	}

}
