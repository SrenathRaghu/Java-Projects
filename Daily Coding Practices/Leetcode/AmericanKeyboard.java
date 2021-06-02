package com.prep;

public class AmericanKeyboard {

	public static void main(String[] args) {

		String s = "adfjgl";

		String s2 = "asdfghjkl";

		String d = "";

		for (int i = 0; i < s2.length(); i++)

		{

			char c = s2.charAt(i);

			if (s.contains(Character.toString(c)))

			{
				d += c;

			}

		}

		System.out.println(d);

	}

}
