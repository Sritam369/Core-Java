package com.sri.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



class Sorting{
	private int id;
	public String name;
	private double salary;
	public Sorting(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Sorting [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
	
public class SortObjectInAscending {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int s = Integer.parseInt(sc.nextLine());
		Sorting arr[]=new Sorting[s];
		System.out.println("enter elements");
		for(int i=0;i<s;i++) {
			System.out.println("enter id");
			int id=Integer.parseInt(sc.nextLine());
			System.out.println("enter name");
			String name = sc.nextLine();
			System.out.println("enter salary");
			double salary = Double.parseDouble(sc.nextLine());
			Sorting s1 = new Sorting(id,name,salary);
			arr[i]=s1;
		}
		Arrays.sort(arr, Comparator.comparing((Sorting a) -> a.name));

		System.out.println(Arrays.toString(arr));
		sc.close();

	}

}
