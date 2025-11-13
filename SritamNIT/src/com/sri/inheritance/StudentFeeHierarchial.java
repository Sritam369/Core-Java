package com.sri.inheritance;

import java.util.Scanner;

class Students{
	protected int id;
	protected String name;
	protected double fee;
	public Students(int id, String name, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	
}
class Dayscholar extends Students{
	protected double transport;

	public Dayscholar(int id, String name, double fee, double transport) {
		super(id, name, fee);
		this.transport = transport;
	}

	
	
	@Override
	public String toString() {
		return "Dayscholar [transportfee=" + transport + ", id=" + id + ", name=" + name + ", examfee=" + fee + "]";
	}



	public double payFee(double amount) {
		double total = fee+transport;
		return total;
	}
}
class Hosteller extends Students{
	protected double hostel;

	public Hosteller(int id, String name, double fee, double hostel) {
		super(id, name, fee);
		this.hostel = hostel;
	}

	
	@Override
	public String toString() {
		return "Hosteller [hostelfee=" + hostel + ", id=" + id + ", name=" + name + ", examfee=" + fee + "]";
	}


	public double payFee(double amount) {
		double total = fee+hostel;
		return total;
	}
}


public class StudentFeeHierarchial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = Integer.parseInt(sc.next());
		if(num==3) {
			System.out.println("Invalid choice");
			System.exit(0);
		}
		
		System.out.println("enter student id");
		int id =Integer.parseInt(sc.next());
		System.out.println("enter student name");
		String name = sc.next();
		System.out.println("enter exam fee");
		double fee=Double.parseDouble(sc.next());
		System.out.println("enter hostel/transport fee");
		double hfee= Double.parseDouble(sc.next());
		System.out.println("enter amount paid");
		int amount = Integer.parseInt(sc.next());
		
		if(num==1) {
			Dayscholar d =new Dayscholar(id,name,fee,hfee);
			System.out.println(d);
			
			
			if(d.payFee(amount)==amount) {
				System.out.println("all fees are cleared");
			}
			else {
				System.out.println("remaining fees are "+(d.payFee(amount)-amount));
				System.exit(0);
			}
		}
		if(num==2) {		
			Hosteller h =new Hosteller(id,name,fee,hfee);
			System.out.println(h);
			
			if(h.payFee(amount)==amount) {
				System.out.println("all fees are cleared");
			}
			else {
				System.out.println("remaining fees are "+(h.payFee(amount)-amount));
				
			}
		}
		}

	}


