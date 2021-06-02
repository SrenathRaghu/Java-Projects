package com.phone;

public class FactoryMain {

	public static void main(String[] args) {
		
		
		OperatingSystem o = new OperatingSystem();
		
		OS obj = o.getInstance("close");
		
		obj.spec();

	}

}
