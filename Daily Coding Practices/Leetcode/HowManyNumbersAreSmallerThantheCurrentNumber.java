package com;

public class HowManyNumbersAreSmallerThantheCurrentNumber {

	public static void main(String[] args) {
		
		
		int [] nums = {8,1,2,2,3};
		
		int [] nums2 = new int [nums.length];
		
		
		
		for(int i=0;i<nums.length;i++)
			
		{
			int count = 0;
			for(int j=0;j<nums.length;j++)
			{
				if( i!=j && nums[i] > nums[j] )
				{
					count++;
				}	
				
			}
		nums2[i]=count;	
			
			
			
		}
		
		for(int z : nums2)
		
		System.out.println(z);

	}

}
