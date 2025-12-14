package com.sri.inner_class;

class Person{
	private String name;
	private int age;
	private Heart heart;
	
	public Person(String name,int age) {
		this.name = name;
		this.age =age;
		this.heart=new Heart(72);
	}
	
	public void describe() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Heart beats per minute: "+this.heart.getBeatsPerMinute());
	}
	
	private class Heart{
		private int beatsPerMinute;

		public Heart(int beatsPerMinute) {
			super();
			this.beatsPerMinute = beatsPerMinute;
		}
		
		public int getBeatsPerMinute() {
			return this.beatsPerMinute;
		}
		public void setBeatsPerMinute(int beatsPerMinute) {
			this.beatsPerMinute=beatsPerMinute;
		}
	}
}


public class PersonAndHeart {

	public static void main(String[] args) {
		Person p = new Person("sritam",24);
		p.describe();

	}

}
