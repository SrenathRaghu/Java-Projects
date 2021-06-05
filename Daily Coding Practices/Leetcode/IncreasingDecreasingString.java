package com;

public class IncreasingDecreasingString {

	public static void main(String[] args) {
		
		String s = "aaaabbbbcccc";
		
		String s1 ="";
		
		for(int i=0;i<s.length()-1;i++)
			
		{
			
			
			
			if(s.charAt(i) != s.charAt(i+1) )	
			
			{
				
				s1+=s.charAt(i);
				
			}
			
		}
		
		System.out.println(s1);

	}

}
