package com.fita;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,4,6,8);
		
		Set<Integer> squareSet = number.stream().map(x -> x*x).collect(Collectors.toSet()); 
		
		System.out.println(squareSet);
		
		List<String> list = Arrays.asList("5.6", "7.4", "4","1", "2.3"); 
		list.stream().flatMap(num -> Stream.of(num)). 
        forEach(System.out::println);  
		
		List<Integer> l = new ArrayList<>();
		
		l.add(1);
		
		l.add(2);
		
		l.add(3);
		
		List<Integer> list1 = l.stream().flatMap(x -> Stream.of(x,x*x)).collect(Collectors.toList());

		System.out.println(list1);
		
		List<String> names = Arrays.asList("Srenath","Ilakkiya","Das","Srivats","Vijay");
		
		List<String> result = names.stream().filter(s ->s.startsWith("S")).collect(Collectors.toList());
		
		System.out.println(result);
		
		List<String> show = names.stream().sorted().collect(Collectors.toList());
		
		System.out.println(show);
		
		number.stream().forEach(y -> System.out.println(y));
		
		int even = number.stream().filter(x ->  x%2==0).reduce(0,(ans,i) -> ans+i);
		
		System.out.println(even);

	}

}
