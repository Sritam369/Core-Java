package com.sri.blc;

public class StudentInstance {
int studentId;
String studentName;
int studentMarks;
char studentGrade;

public void setStudentDetails(int id,String name,int marks) {
	studentId=id;
	studentName=name;
	studentMarks=marks;
}
public void getStudentDetails() {
	System.out.println("student name is: "+studentName);
	System.out.println("student id is: "+studentId);
	System.out.println("student mark is: "+studentMarks);
	if(studentMarks>=90) {
		studentGrade='A';
		System.out.println("student grade is: "+studentGrade);
	}
	else if(studentMarks>=81 && studentMarks<90) {
		studentGrade='B';
		System.out.println("student grade is: "+studentGrade);
	}
	else if(studentMarks>=71 && studentMarks<80) {
		studentGrade='C';
		System.out.println("student grade is: "+studentGrade);
	}
	else if(studentMarks>=61 && studentMarks<70) {
		studentGrade='D';
		System.out.println("student grade is: "+studentGrade);
	}
	else {
		studentGrade='E';
		System.out.println("student grade is: "+studentGrade);
	}
	
}
}