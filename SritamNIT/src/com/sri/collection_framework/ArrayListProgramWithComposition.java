package com.sri.collection_framework;

import java.util.ArrayList;
import java.util.List;

record Professor(String name, String specialization) {
	
}
class Department{
	private String deptName;
	private List<Professor> listOfProfessors;
	public Department(String deptName) {
		this.deptName=deptName;
		listOfProfessors=new ArrayList<Professor>();
	}
	public String getDeptName() {
		return deptName;
	}
	public List<Professor> getListOfProfessors() {
		return listOfProfessors;
	}
	public void add(Professor professor) {
		listOfProfessors.add(professor);
	}
}

public class ArrayListProgramWithComposition {
   void main() {
	   Department d = new Department("CSE");
	   d.add(new Professor("Ravi","java"));
	   d.add(new Professor("Kishore","c"));
	   IO.println("Professors in "+d.getDeptName()+" are:");
	   List<Professor>list = d.getListOfProfessors();
	   list.forEach(IO::println);
   }
}
