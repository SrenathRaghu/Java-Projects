package com.phone;

public class OperatingSystem
{


	public OS getInstance( String s)
	
	{
		
		if (s.equals("Open"))
			
		return new Android();
		
		else if (s.equals("close"))
			
			return new Ios();
		
		else 
			
			return new Windows();
		
		
		
	}
	
	
	
	
}
