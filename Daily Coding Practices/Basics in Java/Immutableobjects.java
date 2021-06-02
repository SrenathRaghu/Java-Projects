package com.fita;

import java.util.Arrays;
import java.util.List;

public class Immutableobjects {

	public static void main(String[] args) {
		
		//Creating Immutable objects using factory methods in java9
		
		List<String> names = Arrays.asList("Srenath","Ilakkiya","Das","Srivats","Vijay");
		
		System.out.println(names);
		
		names.add("C");
		
		
		System.out.println(names);

	}

}
