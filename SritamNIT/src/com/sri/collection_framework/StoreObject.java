package com.sri.collection_framework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Student implements Serializable{
	private Integer studentId;
	private String studentName; 
	private Double studentFees;
	private LocalDate dateOfAdmission;
	
	public Student(Integer studentId, String studentName, Double studentFees, LocalDate dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
}

public class StoreObject {
 void main() throws IOException {
	 String filepath="D:\\new\\Product.txt";
	 var fout=new FileOutputStream(filepath);
	 var oos = new ObjectOutputStream(fout);
	 
	 try(fout;oos){
		 
	 ArrayList<Student>list=new ArrayList<>();
	 int size = Integer.parseInt(IO.readln("enter size"));
	 for(int i=0;i<size;i++) {
		 int id = Integer.parseInt(IO.readln("enter id"));
		 String name = IO.readln("enter name");
		 double fees = Double.parseDouble(IO.readln("enter fees"));
		 String date = IO.readln("enter a date");
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	     LocalDate time = LocalDate.parse(date, formatter);
		 list.add(new Student(id,name,fees, time));
	 }
	 for(Student s:list) {
		 oos.writeObject(s);
	 }
	 IO.println("object stored successfully");
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
 }
}
