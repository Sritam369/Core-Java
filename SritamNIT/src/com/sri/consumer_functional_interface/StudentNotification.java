package com.sri.consumer_functional_interface;

import java.util.function.Consumer;

record Student(Integer id,String name,String course) {}

public class StudentNotification {

	public static void main(String[] args) {
		
        
        int size = Integer.parseInt(IO.readln("Enter number of students : "));
        Student s[] = new Student[size];
        Consumer<Student> message = wel -> IO.println("Hello "+wel.name()+"! Welcome to the "+wel.course()+" course.");
        int c=1;
        for(int i=0;i<size;i++) {
        	IO.println("enter details for student "+c+"");
        	int id = Integer.parseInt(IO.readln("Enter student id : "));
        String name = IO.readln("enter student name : ");
        String course = IO.readln("enter course name : ");
        s[i]= new Student(id,name,course);
        message.accept(s[i]);
        c++;
        }        
	}

}
