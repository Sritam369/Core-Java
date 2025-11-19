package com.sri.hasa_relation;

import java.util.Scanner;

class Address{
	private String street;
	private String city;
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
}

class Employee{
	private String name;
	private final Address address;
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address.toString() + "]";
	}
	
}

public class EmployeeInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter street");
		String street = sc.nextLine();
		System.out.println("enter city");
		String city = sc.nextLine();
		System.out.println("enter name");
		String name = sc.nextLine();
        Address add = new Address(street,city);
        Employee emp = new Employee(name,add);
        System.out.println(emp);
        sc.close();
	}

}
