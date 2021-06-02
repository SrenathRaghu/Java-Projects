package com.OCP;

public class InsuranceMain {

	public static void main(String[] args) {
		
		
		
		HealthInsurance HI = new HealthInsurance();
		
		VehicleInsurance VI = new VehicleInsurance();
		
		HomeInsurance HII = new HomeInsurance();
		
		System.out.println(HI.isLoyalCustomer());
		
		System.out.println(VI.isLoyalCustomer());
		
		System.out.println(HII.isLoyalCustomer());

	}

}
