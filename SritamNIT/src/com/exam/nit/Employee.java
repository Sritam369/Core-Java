package com.exam.nit;

public class Employee {
private int id;
private String name;
private int daysWorked;

public Employee(int id, String name, int daysWorked) {
	super();
	this.id = id;
	this.name = name;
	this.daysWorked = daysWorked;
}
public Employee(Employee emp) {
	super();
	this.id = emp.id;
	this.name = emp.name;
	this.daysWorked = emp.daysWorked;
}
public boolean efficientWorker() {
	int count = 0;
	for(int i=1;i<=daysWorked;i++) {
		if(daysWorked%i==0) {
			count++;
		}
		
	}
	if(count == 2) {
		return true;
	}
	else {
		return false;
	}
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", daysWorked=" + daysWorked + ", Efficienct Worker = "+efficientWorker()+"]";
}

}
