package com.sri.collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

class Employees{
	private String name;
	private String position;
	private double salary;
	public Employees(String name, String position, double salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
	
}

class Directory{
	ArrayList<Employees> list = new ArrayList<>();
	public void addEmployee() {
		String name = IO.readln("Enter employee name");
		String position = IO.readln("Enter employee position");
		double sal = Double.parseDouble(IO.readln("enter employee salary"));
		
		list.add(new Employees(name,position,sal));
	}
	public void displayAllEmployees() {
		IO.println(list.toString());
	}
	public void updateEmployee() {
		String name = IO.readln("enter emplpoyee name whose record you want to update");
		String position = IO.readln("Enter employee new position");
		double sal = Double.parseDouble(IO.readln("enter employee new salary")); 
		boolean isName = false;
		for(Employees lists:list) {
			if(lists.getName().equals(name)) {
				lists.setPosition(position);
				lists.setSalary(sal);
				isName=true;
			}			
		}
		if(isName==false) {
			IO.println("employee with "+name+" not found");
		}
		IO.println("Employee with name "+name+" record updated");
	}
	public void deleteEmployee() {
		String name = IO.readln("enter emplpoyee name whose record you want to delete");
		Iterator<Employees>itr=list.iterator();
		boolean isName = false;
		while(itr.hasNext()) {
			Employees emp = itr.next();
			if(emp.getName().equals(name)) {
				itr.remove();
				isName=true;
			}			
		}
		if(!isName) {
			IO.println("employee with "+name+" not found");
		}
		else {
			IO.println("Employee with name "+name+" record deleted");
		}
	}
}

public class EmployeeDirectory {
   void main() {
	   int size = Integer.parseInt(IO.readln("enter size"));
	   Directory d = new Directory();
	   for(int i=0;i<size;i++) {
		  d.addEmployee(); 
	   }
	   String choice = IO.readln("Do you want to see employee details [yes/no]");
	   if(choice.equalsIgnoreCase("yes")) {
		   d.displayAllEmployees();
	   }
	   String choice2 = IO.readln("Do you want to update employee details [yes/no]");
	   if(choice2.equalsIgnoreCase("yes")) {
		   d.updateEmployee();
		   d.displayAllEmployees();
	   }
	   String choice3 = IO.readln("Do you want to delete employee details [yes/no]");
	   if(choice3.equalsIgnoreCase("yes")) {
		  d.deleteEmployee();
		  d.displayAllEmployees();
	   }
   }
}
