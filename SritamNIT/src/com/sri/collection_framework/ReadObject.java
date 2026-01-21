package com.sri.collection_framework;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	void main() throws IOException {
		 String filepath="D:\\new\\Product.txt";
		 var fin=new FileInputStream(filepath);
		 var ois = new ObjectInputStream(fin);
		 
		 try(fin;ois){
			 while(true) {
				 Student students = (Student) ois.readObject();
				 IO.println(students);
			 }
		 }
		 catch(EOFException e) {
			 IO.println("end of file reached:"+e);
		 }
		 catch(ClassNotFoundException e) {
			 IO.println("end of file reached:"+e);
		 }
}
}