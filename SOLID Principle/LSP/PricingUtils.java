package com.LSP;

import java.util.ArrayList;
import java.util.List;

public class PricingUtils {

	public static void main(String[] args) {
		
		Product first = new Product();
		
		Product second = new Product();
		
		Product third = new InhouseProduct();
		
		
		List<Product> al = new ArrayList<>();
		
		al.add(first);
		
		al.add(second);
		
		al.add(third);
		
		for (Product p : al)
			
		{
			
			System.out.println(p.getdiscount());
			
		}

	}

}
