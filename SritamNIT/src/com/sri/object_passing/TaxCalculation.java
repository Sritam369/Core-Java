package com.sri.object_passing;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee name");
		String ename=sc.nextLine();
		System.out.println("enter employee id");
		int eid=Integer.parseInt(sc.nextLine());
		System.out.println("enter employee basic salary");
		double ebasic=Double.parseDouble(sc.nextLine());
		System.out.println("enter employee hra");
		double ehra=Double.parseDouble(sc.nextLine());
		System.out.println("enter employee da");
		double eda=Double.parseDouble(sc.nextLine());
		Employee2 emp = new Employee2(eid,ename,ebasic,ehra,eda);
		TaxUtil tax = new TaxUtil();
		System.out.println("employee tax "+tax.calculateTax(emp));
		
		System.out.println("enter manager name");
		String mname=sc.nextLine();
		System.out.println("enter manager id");
		int mid=Integer.parseInt(sc.nextLine());
		System.out.println("enter manager basic salary");
		double mbasic=Double.parseDouble(sc.nextLine());
		System.out.println("enter manager hra");
		double mhra=Double.parseDouble(sc.nextLine());
		System.out.println("enter manager da");
		double mda=Double.parseDouble(sc.nextLine());
		System.out.println("enter manager project");
		double mpro=Double.parseDouble(sc.nextLine());
		Manager m = new Manager(mid,mname,mbasic,mhra,mda,mpro);	
		System.out.println("manager tax "+tax.calculateTax(m));
		
		System.out.println("enter trainer name");
		String tname=sc.nextLine();
		System.out.println("enter trainer id");
		int tid=Integer.parseInt(sc.nextLine());
		System.out.println("enter trainer basic salary");
		double tbasic=Double.parseDouble(sc.nextLine());
		System.out.println("enter trainer hra");
		double thra=Double.parseDouble(sc.nextLine());
		System.out.println("enter trainer da");
		double tda=Double.parseDouble(sc.nextLine());
		System.out.println("enter trainer batch count");
		int tbatchc=Integer.parseInt(sc.nextLine());
		System.out.println("enter trainer perk");
		double tperk=Double.parseDouble(sc.nextLine());
		Trainer t = new Trainer(tid,tname,tbasic,thra,tda,tbatchc,tperk);		
		System.out.println("trainer tax "+tax.calculateTax(t));
		
		System.out.println("enter source name");
		String sname=sc.nextLine();
		System.out.println("enter source id");
		int sid=Integer.parseInt(sc.nextLine());
		System.out.println("enter source basic salary");
		double sbasic=Double.parseDouble(sc.nextLine());
		System.out.println("enter source hra");
		double shra=Double.parseDouble(sc.nextLine());
		System.out.println("enter source da");
		double sda=Double.parseDouble(sc.nextLine());
		System.out.println("enter source enroll target");
		int senroll=Integer.parseInt(sc.nextLine());
		System.out.println("enter source enroll reached");
		int senrollr=Integer.parseInt(sc.nextLine());
		System.out.println("enter source perk");
		double sperk=Double.parseDouble(sc.nextLine());
		Sourcing s = new Sourcing(sid,sname,sbasic,shra,sda,senroll,senrollr,sperk);		
		System.out.println("sourcing tax "+tax.calculateTax(s));
        sc.close();
	}

}
