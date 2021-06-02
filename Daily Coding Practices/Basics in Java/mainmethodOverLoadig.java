package com.fita;

public class mainmethodOverLoadig {

	public static void main(String[] args) {
		Test	t	=	new	Test();
t.main("Hi");

	}

}
	class	Test{
		
		public  void main(String	str1)	{
			
			System. out. println("I	am"	+	str1);
			main("Hello","Welcome");
		}
		
		public  void main(String	str1	,String	str2){
			System. out. println("Iam"+str1	+str2);
			
		}
	}
	
