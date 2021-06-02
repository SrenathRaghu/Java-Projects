package com.fita;

public class Byref {
	
	int data = 40;
	
	void change (Byref b) {
		
		b.data = b.data + 100;
	}

	public static void main(String[] args) {
		
		
		Byref by = new Byref();
		
		System.out.println("before	" + by.data);
		
		by.change(by);
		
		System.out.println("after	" + by.data);

	}

}
