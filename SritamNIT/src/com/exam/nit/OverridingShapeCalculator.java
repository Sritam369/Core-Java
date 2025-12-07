package com.exam.nit;

import java.util.Scanner;

public class OverridingShapeCalculator {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter square side");
		    double sside = Double.parseDouble(sc.next());
		    System.out.println("enter triangle side1");
		    double tside1 = Double.parseDouble(sc.next());
		    System.out.println("enter triangle side2");
		    double tside2 = Double.parseDouble(sc.next());
		    System.out.println("enter triangle side3");
		    double tside3 = Double.parseDouble(sc.next());
		    Shape s = new Square(sside);
		     s.area();
		     s.perimeter();
		     System.out.println();
		     Shape s1 = new Triangle(tside1,tside2,tside3);
		     s1.area();
		     s1.perimeter();
		     sc.close();
		  }
		}
abstract class Shape{
public abstract void area();
public abstract void perimeter();
}
class Square extends Shape{
public double side;
public Square(double side){
this.side=side;
}
             public void area(){
		        double area = side*side;
		        System.out.println("Square Area: "+area);
		     }
		     public void perimeter(){
		         double peri = side*4;
		        System.out.println("Square Perimeter: "+peri);
		     }
		}
class Triangle extends Shape{
		    public double side1;
		    public double side2;
		    public double side3;
		    public Triangle(double side1, double side2, double side3){
		        this.side1=side1;
		        this.side2=side2;
		        this.side3=side3;
		    }
		     public void area(){
		        double area = (side1+side2+side3)/2;
		        System.out.println("Triangle Area: "+area);
		     }
		     public void perimeter(){
		         double peri = side1+side2+side3;
		         System.out.println("Triangle Perimeter: "+peri);
}
}