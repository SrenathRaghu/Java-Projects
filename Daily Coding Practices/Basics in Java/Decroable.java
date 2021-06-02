package com.fita;

public interface Decroable {
	
	// one abstract method
	 void decorateWithCurtains();
	 
	 // default method
	 default void decorateWithPaints()
	 {
	  System.out.println("Decorating using paints");
	 }
	 
	 // Overriding method of java.lang.Object
	 @Override
	 public int hashCode();

}
