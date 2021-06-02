package com.fita;

interface inttfunc {
	
	
	public String name(double u,String i);

}


public class Lambda2 {

	public static void main(String[] args) {
		
		
		inttfunc j = (h,o) -> (h +	" Sree moving out of " + o);
		
		System.out.println(j.name(1000, "TCS"));
	}

}
