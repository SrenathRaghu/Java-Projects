package com.fita;

public class Assignment1 {
	
	public int add(int a1,int b1) {
		
		int z = a1+b1;
		return z;
	}

	public String add(String p) {
		String v = ("old is gold "	+	p);
		return v;
		
	}
	
	public float add(float l,float l1) {
		
		float q = (l*l1);
		return q;
		
	}
	public static void main(String[] args) {
		
		Assignment1	A	=	new Assignment1();
		
		System.out.println("The Output is "	+	A.add(5, 10) );
		System.out.println("The Output is "	+	A.add("Right!"));
		System.out.println("The Output is "	+	A.add(4.4f, 10.0f));
     
	}

}
