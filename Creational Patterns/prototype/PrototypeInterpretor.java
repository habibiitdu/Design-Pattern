package com.designPattern.prototype;

public class PrototypeInterpretor {
	public static void main(String args[]){
		Mango realMango = new Mango("Mango01");
		Mango cloneMango = (Mango) realMango.clone(); 
		System.out.println("Printing from clone version: "+cloneMango.name);
		
		Banana realBanana = new Banana("Banana01");
		Banana cloneBanana = (Banana) realBanana.clone(); 
		System.out.println("Printing from clone version: "+ cloneBanana.name);
	}
}
