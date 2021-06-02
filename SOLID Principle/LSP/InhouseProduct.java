package com.LSP;

public class InhouseProduct extends Product {
	
	@Override
	public double getdiscount() {
		
		this.getextradiscount();
			
		
		return discount;
	};
	
	public double getextradiscount()
	
	{
		
		return discount = discount * 1.5;
		
	}

}
