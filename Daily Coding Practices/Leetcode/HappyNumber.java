package com;

public class HappyNumber {

	public static void main(String[] args) {
		
		int k = 19;
		
		  int result = sum(10);
		    System.out.println(result);
		  }
		  public static int sum(int k) {
		    if (k > 0) {
		      return k + sum(k - 1);
		    } else {
		      return 0;
		    }
	}
	
	
	
}
