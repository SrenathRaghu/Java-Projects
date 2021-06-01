package com.java;

public class MultithreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		Runnable r = () ->  {
			
			
		for (int i =1;i<=5;i++)
			
		{
			
			System.out.println("Hii");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
			
		};
		
		Runnable r1 = () -> {
			
			for (int i =1;i<=5;i++)
				
			{
				
				System.out.println("Hello");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
				
			
		};
		
		Thread t1 = new Thread(r);
		
		Thread t2 = new Thread(r1);
		
		
		
		t1.start();
		
		t2.sleep(50);
		
		t2.start();
		
		t1.join();
		
		t2.join();
		
		System.out.println("Bye!!");

	}

}
