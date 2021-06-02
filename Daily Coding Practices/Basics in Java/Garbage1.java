package com.fita;

public class Garbage1 {

	public static void main(String[] args) {
		
		Garbage1 g1 = new Garbage1();
		
		Garbage1 g2 = new Garbage1();
		
		g1 = null;
		
		g2 = null;
		
		System.gc();
		
		System.out.println(g2);
		
		System.out.println("object is garbage collected");
		
		

	}

}
