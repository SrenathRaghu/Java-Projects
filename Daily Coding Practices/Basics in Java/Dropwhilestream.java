package com.fita;

import java.util.stream.Stream;

public class Dropwhilestream {

	public static void main(String[] args) {
		
		Stream.of("a","b","c","","e","f").dropWhile(s -> !s.isEmpty()).forEach(System.out::print);
		

	}

}
