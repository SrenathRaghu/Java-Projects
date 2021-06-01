package com.fita;


public  class Assignment2 {
	

	public	static void main(String[] args) {
		
		
		tcs1	h	=	new	HR();	
		tcs1	i	=	new	IT();
		
		
		System.out.println(h.bob("For the year 2020"));
		System.out.println(i.bob("For the year 2020"));

	}
}


class	tcs1{
	
	public String bob(String l) {
		
				
		return null;
	
}
	}
	
	class HR extends tcs1{
		@Override
		public String bob(String l1) {
			
			String n1 = ("Basic Salary for HR will be 1000 " + l1);
			
			return n1;
		}
		}
		
		class IT extends tcs1{
			@Override
			public String bob(String l2) {
				
				String n2 = ("Basic Salary for IT will be 3000 " + l2);
				
				return n2;
				
			}
}


