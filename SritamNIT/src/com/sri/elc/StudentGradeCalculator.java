package com.sri.elc;

import java.util.Scanner;

import com.sri.blc.StudentInstance;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		StudentInstance st=new StudentInstance();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student id");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("enter student name");
        String name=sc.nextLine();
        System.out.println("enter student mark");
        int mark=Integer.parseInt(sc.nextLine());
        st.setStudentDetails(id, name, mark);
        st.getStudentDetails();
        sc.close();
	}

}
