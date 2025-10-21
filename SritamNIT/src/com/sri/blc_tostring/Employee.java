package com.sri.blc_tostring;

public class Employee {
private int id;
private String name;
private double salary;
public void setEmployeeData(int id,String name,double salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
}
public void calaculateIncrement() {
	if(salary<50000) {
		double increment=salary*10/100;
		salary+=increment;
		System.out.println("increment is"+increment);
	}
	else if(salary>50000 && salary<80000) {
		double increment=salary*7/100;
		salary+=increment;
		System.out.println("increment is"+increment);
	}
	else{
		double increment=salary*5/100;
		salary+=increment;
		System.out.println("increment is"+increment);
	}
	System.out.println("updated salary is"+salary);
}

public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}



}
