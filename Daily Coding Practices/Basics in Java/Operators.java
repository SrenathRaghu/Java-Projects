package com.fita;

public class Operators {
	
	
	static Operators ops = new Operators();

	public static void main(String[] args) {
		
		toinc();
		unary();
		unary1();
		unary2();
		unary3();
		unary4();
	}	
	
	
		public static void	toinc() {
			
			int s = 10; 
			
			int s1 = 40;
			
			System.out.println("The Output is " + ((s<s1)^(s1>s)));
			
				
		}
		
public static void	unary() {
			
			int s = 5;  
			int	c	=	++s;
			System.out.println("The Output is " + c);
			
				
		}
public static void	unary1() {
	
	int s = +7;  
	int	c	=	~s;
	System.out.println("The Output is " + c);
	
		
}
public static void	unary2() {
	
	int s = 25;  
	int	c	=	s--;
	System.out.println("The Output is " + c);
	
		
}
public static void	unary3() {
	
	int s = 8;  
	int	c	=	s++;
	System.out.println("The Output is " + c);
	
		
}
public static void	unary4() {
	
	int t = 15;  
	int	c	=	--t;
	System.out.println("The Output is " + c);
	
		
}
	
	}

	


