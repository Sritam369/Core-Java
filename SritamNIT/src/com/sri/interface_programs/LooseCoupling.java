package com.sri.interface_programs;

interface HotDrink{
	void prepare();
}
class Tea implements HotDrink{
	public void prepare() {
		System.out.println("preparing tea");
	}
}
class Coffee implements HotDrink{
	public void prepare() {
		System.out.println("preparing coffee");
	}
}
class Horlicks implements HotDrink{
	public void prepare() {
		System.out.println("preparing horlicks");
	}
}

class Restaurant{
	public static void acceptObject(HotDrink hd) {
		hd.prepare();
	}
}

public class LooseCoupling {

	public static void main(String[] args) {
		Restaurant.acceptObject(new Tea());
		Restaurant.acceptObject(new Coffee());
		Restaurant.acceptObject(new Horlicks());

	}

}
