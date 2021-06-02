package com.fita;

public class Byvalue {
	
	

	int data = 50;
	
	void change(int data) {
		
		data = data + 100;
	}

	public static void main(String[] args) {
		
		Byvalue b = new Byvalue();
		
		System.out.println("before change" + b.data);
		
		b.change(500);
		
		
		System.out.println("After change" + b.data);
		

	}

}
