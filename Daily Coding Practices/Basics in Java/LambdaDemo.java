package com.fita;
@FunctionalInterface
interface intfunc {
	
	
	public void name(double u,String i);

}


public class LambdaDemo {

	public static void main(String[] args) {
		
		
		intfunc j = (h,o) -> System.out.println(h +	" Sree moving out of " + o);
		
		j.name(1000, "TCS");
	}

}
