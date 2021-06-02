package com.fita;

public class StringAPIDemo {

	public static void main(String[] args) {
		
		
		String s ="Java";
		
		String s1 = "\n\t   Java    \u2005";
		
		System.out.println(s.repeat(3));
		
		System.out.println(s1.strip());
		
		System.out.println(s1.stripLeading());
		
		System.out.println(s1.stripTrailing());

	}

}
