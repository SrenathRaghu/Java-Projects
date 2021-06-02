package com.DIP;

public class ProductCatalogue {
	
	public void listallproducts()
	
	{
	
	ProductRepository pr = ProductFactory.create();
	
     System.out.println(pr.Getallproductnames());


}
}