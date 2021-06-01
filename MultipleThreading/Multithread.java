package com.java;

public class Multithread {

	public static void main(String[] args) {

		int n = 8;

		for (int i = 0; i < n; i++) {

			MultithreadDemo o = new MultithreadDemo();

			o.start();

		}

	}

}

class MultithreadDemo extends Thread {

	public void run() {

		try {

			System.out.println("Thread " + Thread.currentThread().getId() + "is running");

		}

		catch (Exception e) {

			System.out.println("Exception is caught");
		}
	}

}
