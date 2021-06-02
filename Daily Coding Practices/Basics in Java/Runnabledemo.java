package com.fita;

public class Runnabledemo {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(()->System.out.println("Run"));
		
		t1.run();
	}
	
	
     
}
