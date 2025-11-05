package com.sri.inheritance;

class Parent{
	private int x;
	private int y;
	public void setData(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}	
}

class Child extends Parent{
	public void showData() {
		System.out.println("x value is: "+getX());
		System.out.println("y value is: "+getY());
	}
}

public class SingleLevelWithEncapsulation {

	public static void main(String[] args) {
		Child child=new Child();
		child.setData(100, 200);
		child.showData();

	}

}
