package com.fita;

public class Newinstance {
	
	String name = "Hello";

	public static void main(String[] args) {
		
    try {
    
    	Class c = Class.forName("Newinstance");
    	
    	Newinstance o = (Newinstance) c.newInstance();
    	
    	System.out.println(o.name);
    	
    }
    
    catch(Exception e){
    	
    	System.out.println(e);
    }
	}

}
