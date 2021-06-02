package com.fita;

public class Constructors {

	int x;
	int y;

	public Constructors(int x, int y) {
		int c;

		c = x + y;
		System.out.println(c);
		

	}

	public Constructors() {
	
	}

	public static void main(String[] args) {

		Constructors cs = new Constructors(3,5);

	

	}

}
