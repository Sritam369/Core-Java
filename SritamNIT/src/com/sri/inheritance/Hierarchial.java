package com.sri.inheritance;

class Shape{
	protected double x;

	public Shape(double x) {
		super();
		this.x = x;
	}
}
class Circle extends Shape{
      final double PI = 3.14;
	public Circle(double radius) {
		super(radius);
	}
	public void areaOfCircle() {
		double area = this.PI*super.x*super.x;
		System.out.println("area of circle is "+area);
	}	
}
class Rectangle extends Shape{
  private int length;
	public Rectangle(int breadth,int length) {
		super(breadth);
		this.length=length;
	}
	public void areaOfRectangle() {
		double area = this.length*super.x;
		System.out.println("area of rectangle is "+area);
	}
	
}

public class Hierarchial {

	public static void main(String[] args) {
		Circle cir = new Circle(2.5);
		Rectangle r = new Rectangle(10,5);
		cir.areaOfCircle();
        r.areaOfRectangle();
	}

}
