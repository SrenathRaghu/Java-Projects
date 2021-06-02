package com.DIP;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository  implements  ProductRepository{
	
	public List<String> Getallproductnames()
	
	{
		return Arrays.asList("Soap","Toothpaste");
		
		
	}

}
