package com.fita;

import java.util.Scanner;

public class Decision {
	
	
	static	Scanner scan = new Scanner(System.in);
	


	public static void main(String[] args) {
		
		
		System.out.println("Etr	a	value	");
		
		
		int i = scan.nextInt();
		
	
	if (i == 0) {
		
		
		
		System.out.println("hello1");
	}
	
	else if (i > 80) {
		
		System.out.println("hello2");
		
	}
	
else if (i == 80) {
		
		System.out.println("hello3");
		
	}
	
else if (i >= 80) {
	
	System.out.println("hello4");
	
}
	
else if (i <= 80) {
	
	System.out.println("hello5");
	
}

else  {
	
	System.out.println("hello6");
	
}
}
	
}
