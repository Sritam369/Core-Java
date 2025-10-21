package com.sri.elc;

import java.util.Scanner;

import com.sri.blc.Bank;

public class BankCustomerDetails {

	public static void main(String[] args) {
		Bank bn=new Bank();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer name");
		String name=sc.nextLine();
		System.out.println("enter acc number");
		int acc=Integer.parseInt(sc.nextLine());
		System.out.println("enter current balance");
		double bal=Double.parseDouble(sc.nextLine());
		bn.setCustomerDetails(name, acc, bal);
		
		
		
		for(int i=0; ;i++)
		{
			System.out.println("enter your choice");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) 
			{
			case 1-> {System.out.println("enter deposit amount");
			double damount=Double.parseDouble(sc.nextLine());
				bn.deposit(damount);
			}
			case 2->{System.out.println("enter withdrawl amount");
			double wamount=Double.parseDouble(sc.nextLine());
				bn.withdraw(wamount);
			}
			case 3-> System.out.println("current balance is: "+bn.getCustomerDetails());
			case 4-> System.out.println("customer details: "+bn.displayDetails());
			case 5-> System.exit(0);
			default->System.out.println("invalid choice");
			}
		}
		

		
	}

}
