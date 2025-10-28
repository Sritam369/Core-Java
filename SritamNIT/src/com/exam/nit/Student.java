package com.exam.nit;

public class Student {
private String name;
private int attendance;
private int marks;
private int labPerformance;
private int dailyTaskScore;

public Student(String name, int attendance, int marks, int labPerformance, int dailyTaskScore) {
	super();
	this.name = name;
	this.attendance = attendance;
	this.marks = marks;
	this.labPerformance = labPerformance;
	this.dailyTaskScore = dailyTaskScore;
}
public double percentage() {
	return (attendance+marks+labPerformance+dailyTaskScore)/4.0;
}
public String grade() {
	if(percentage()>90) {
		return "A+";
	}
	else if(percentage()>80) {
		return "A";
	}
	else if(percentage()>70) {
		return "B";
	}
	else if(percentage()>60) {
		return "C";
	}
	else {
		return "Fail";
	}
}
public String eligibility() {
	if(percentage()>60) {
		return "Eligible";
	}
	else {
		return "Not Eligible";
	}
}
@Override
public String toString() {
	return "Student [name=" + name + ", attendance=" +(double) attendance + ", marks=" + (double)marks + ", labPerformance="
			+ (double)labPerformance + ", dailyTaskScore=" + (double)dailyTaskScore + ", percentage = "+percentage()+", grade = "+grade()+", eligibility = "+eligibility()+"]";
}

}
