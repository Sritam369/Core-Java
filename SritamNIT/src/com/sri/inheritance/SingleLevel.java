package com.sri.inheritance;

class TemporaryEmployee{
	protected int id;
	protected String name;
	protected double salary;
	
	public TemporaryEmployee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
class PermanentEmployee extends TemporaryEmployee{
	protected String departmenmt;
	protected String designation;
	
	public PermanentEmployee(int id, String name, double salary, String departmenmt, String designation) {
		super(id, name, salary);
		this.departmenmt = departmenmt;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [id=" + id + ", name=" + name + ", salary=" + salary + ", departmenmt=" + departmenmt
				+ ", designation=" + designation + "]";
	}
	
}

public class SingleLevel {

	public static void main(String[] args) {
		PermanentEmployee p = new PermanentEmployee(101,"Sritam",72000,"cse","developer");
		System.out.println(p);

	}

}
