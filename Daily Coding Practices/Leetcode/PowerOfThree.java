package com;

public class PowerOfThree {

	public static void main(String[] args) {

		int n = 45;

		int flag = 0;

		while (n != 0) {
			if (n % 3 != 0)

			{

				flag = 1;

			}

			n /= 3;

		}
		if (flag == 0)

		{
			System.out.println(true);
		}

		else

		{

			System.out.println(false);

		}
	}

}
