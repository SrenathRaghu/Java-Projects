package com.fita;

public class overridig {

	public static void main(String[] args) {

		icici z = new icici();
		hdfc h = new hdfc();
		hsc s = new hsc();

		System.out.println("The	Rate	is" + z.getrateofint(10F));
		System.out.println("The	Rate	is" + h.getrateofint());
		System.out.println("The	Rate	is" + s.getrateofint(30F));
	}
}

class Damk {
	float getrateofint() {
		return 0;
	}
}

class icici extends Damk {
	float getrateofint(float a) {
		return a;
	}

}

class hdfc extends Damk {

	public float s;

	float getrateofint() {
		s = 20F;
		return s;
	}
}

class hsc extends Damk {
	float getrateofint(float w) {
		return w;
	}
}
