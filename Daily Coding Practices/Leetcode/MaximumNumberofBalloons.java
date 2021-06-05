package com;

public class MaximumNumberofBalloons {

	public static void main(String[] args) {

		String text = "loonbalxballpoon";
		int b = 0;
		int a = 0;
		int l = 0;
		int o = 0;
		int n = 0;

		int c = 0;

		for (int i = 0; i < text.length(); i++)

		{

			char s = text.charAt(i);

			if (s == 'b')

			{

				b++;

			}

			else if (s == 'a')

			{

				a++;

			}

			else if (s == 'l')

			{

				l++;

			}

			else if (s == 'o')

			{

				o++;

			}

			else if (s == 'n')

			{

				n++;

			}
			
		

		}

		int times = text.length() / 7;
        for(int i = 0; i < times ; i++) {
            if(b >=1 && a >= 1 && l >= 2  && o >= 2 && n >= 1) {
                b -= 1;
                a -= 1;
                l -= 2;
                o -= 2;
                n -= 1;
                c++;
            } else {
                break;
            }
        }
        System.out.println(c);

	}
}
