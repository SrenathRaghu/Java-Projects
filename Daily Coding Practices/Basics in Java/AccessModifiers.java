package com.fita;

public	class AccessModifiers {
	
	 int data = 40;
	
	 void msg() {
		
		System.out.println("Hello");
	}
	
	 static class simple {
		
	
	public static void main(String[] args) {
		
		AccessModifiers A = new AccessModifiers();
		
		System.out.println(A.data);
		
		A.msg();

	}

	}
	}
