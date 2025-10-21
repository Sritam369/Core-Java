package com.sri.oop;

import java.util.Scanner;

public class StudentDataWithStaticField {

	public static void main(String[] args) {
		StudentWithStaticField st = new StudentWithStaticField();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter student roll no");
      int roll=Integer.parseInt(sc.nextLine());
      System.out.println("enter student name");
      String name=sc.nextLine();
      System.out.println("enter student fees");
      double fees=Double.parseDouble(sc.nextLine());
	  st.setStudentData(roll, name, fees);
	  st.getStudentData();
	  sc.close();
	}

}
