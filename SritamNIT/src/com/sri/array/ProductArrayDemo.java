package com.sri.array;

import java.util.Scanner;

public class ProductArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int s=Integer.parseInt(sc.nextLine());
		Product arr[]=new Product[s];
		for(int i=0;i<s;i++) {
			System.out.println("enter id");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter price");
			double price= Double.parseDouble(sc.nextLine());
			arr[i]=new Product(id,name,price);
		}
		System.out.println("enter product id to search");
		int pid=Integer.parseInt(sc.next());
		boolean isFound=false;
		for(int i=0;i<s;i++) {
			if(pid==arr[i].getId()) {
				System.out.println(arr[i]);
				isFound=true;
			}
			
		}
		if(isFound==false) {
			System.out.println("Product with "+pid+" not found");
		}
		
          sc.close();
		

	}

}
