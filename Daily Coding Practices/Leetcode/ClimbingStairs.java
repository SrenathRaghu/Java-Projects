package com.prep;

public class ClimbingStairs {

	public static void main(String[] args) {
		// You are climbing a staircase. It takes n steps to reach the top.

		// Each time you can either climb 1 or 2 steps. In how many distinct ways can
		// you climb to the top?

		int n = 10;

		int first = 1;

		int second = 2;

		int next = 0;

		if (n == 1)

		{

			System.out.println(1);

		}

		if (n == 2)

		{

			System.out.println(2);

		}

		for (int i = 3; i <= n; i++) {

			next = first + second;

			first = second;

			second = next;

		}

		System.out.println(next);

	}

}
