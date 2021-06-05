package com;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {

		int[] heights = { 1, 1, 4, 2, 1, 3 };

		int[] dummy = new int[heights.length];

		for (int i = 0; i < heights.length; i++)

		{

			dummy[i] = heights[i];

		}

		Arrays.sort(dummy);

		int count = 0;

		for (int i = 0; i < heights.length; i++)

		{

			if (heights[i] != dummy[i])

			{

				count++;

			}

		}

		System.out.println(count);

	}

}
