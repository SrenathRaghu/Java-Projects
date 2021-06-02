package com.fita;

public class Clone1 implements Cloneable {
	
	@Override
	
	protected Object clone () throws CloneNotSupportedException
	
	{
		return super.clone();
	}
		String name = "Hii";
	public static void main(String[] args) {
	
	Clone1  o = new Clone1();
	System.out.println(o.name);
	
	try {
		Clone1 t = (Clone1) o.clone();
		
		System.out.println(t.name);
	}
		catch	(CloneNotSupportedException g) {
			System.out.println(g);
		}
	}

}
