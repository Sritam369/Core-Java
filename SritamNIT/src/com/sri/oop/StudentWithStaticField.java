package com.sri.oop;

public class StudentWithStaticField {
int rollNumber;
String nameOfStudent;
double fees;
static String college="GCE";
static String course="JAVA";

public void setStudentData(int r,String n,double f) {
	rollNumber=r;
	nameOfStudent=n;
	fees=f;
}
public void getStudentData() {
	System.out.println("student roll is: "+rollNumber);
	System.out.println("student name is: "+nameOfStudent);
	System.out.println("student fees is: "+fees);
	System.out.println("student college is: "+college);
	System.out.println("student course is: "+course);
}
}