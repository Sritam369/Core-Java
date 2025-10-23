package com.sri.copy_constructor;

class Doll{
	private String name;
	private double height;
	
	public Doll(String name, double height) {
		
		this.name = name;
		this.height = height;
	}
	
	public Doll(Doll doll) {
		this.name=doll.name;
		this.height=	doll.height;	
	}

	@Override
	public String toString() {
		return "Doll [name=" + name + ", height=" + height + "]";
	}
	
	
}

public class DollData {

	public static void main(String[] args) {
		
		Doll d1=new Doll("pari",2.5);
		Doll d2=new Doll(d1);
		System.out.println(d2);

	}

}
