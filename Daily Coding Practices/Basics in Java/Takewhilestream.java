package com.fita;

import java.util.stream.Stream;

public class Takewhilestream {

	public static void main(String[] args) {
		
		Stream.of("a","b","c","","e","f").takeWhile(s -> !s.isEmpty()).forEach(System.out::println);

	}

}
