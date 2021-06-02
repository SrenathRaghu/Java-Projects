package com.fita;

public class Demo {
	
	public	void	show(double	d) {
		System. out. println("In	doule"	+d);
	}
	
	public	void	show(String	S) {
		
		System. out. println("In	String"	+S);
		
	}
public	void	show(byte	b) {
		
		System. out. println("In	byte"	+b);
}
static class	useDemo{
	
	public static void main(String[] args) {
		
		byte	a=25;
		
		Demo	j=new	Demo();
		
		j.show(a);
		j.show("hello");
		j.show(250);
		j.show('A');
		j.show("A");
		j.show(7.5);
		
	}
	
}

}
