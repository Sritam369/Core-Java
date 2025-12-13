/*You are required to write a Java program that demonstrates the use of the
java.util.function.Function<T, R> functional interface with either:
A lambda expression, OR
A method reference
Your task is to:
Create an Emp class with:
int empNo
String name
float salary
Read employee details from user input.
Create a Function<Emp, Float> to:
Add 5000.00 bonus to the employee's salary.
Return the updated salary.
Apply the function and print the latest salary.
You may use either a lambda expression or a method reference.*/


package com.exam.nit;

import java.util.Scanner;

interface Function <T>{
	float apply(T x);
}
record Employee2(int id,String name,float salary) {}

public class CustomFunctionalInterface {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter employee id");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("enter employee name");
			String name = sc.nextLine();
			System.out.println("enter employee salary");
			float sal = Float.parseFloat(sc.nextLine());
			Employee2 emp = new Employee2(id,name,sal);
			
			Function<Employee2> updatedSal = sal2 -> sal2.salary()+5000;
			System.out.println("updated salary is : "+updatedSal.apply(emp));
			sc.close();

	}

}
