package com.fita;

import java.util.Scanner;

public class ScannerArithmetic {
	
	
	static	ScannerArithmetic arithop = new ScannerArithmetic();
	static	Scanner scan = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		toMul();
		toDiv();
	}
		public static void	toMul(){
		
			System.out.println("Enter two number for Multiplication :::");
			int a = scan.nextInt();
			int c = scan.nextInt();
			System.out.println("Value of Two number for Multiplication is "	+arithop.toMul(a,c));		
				
}
		public static void	toDiv(){
			
			System.out.println("Enter two number for Division :::");
			float	h = scan.nextFloat();
			float m = scan.nextFloat();
			System.out.println("Value of Two number for Division is "	+arithop.toDiv(h,m));		
				
}
		private int toMul(int a, int c) {
			
			int z =	a*c;
			
				return z;
		}
		
private float toDiv(float h, float m) {
			
			float o =	h/m;
			
				return o;
		}
	

	
			
			
		}
	

