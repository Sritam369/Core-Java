package com.sri.type_parameter;

class Accept <T>{
	private T data;
	public Accept(T data) {
		this.data=data;
	}
	public T getData() {
		return this.data;
	}
}

public class Demo {

	public static void main(String[] args) {
		Accept<Integer> intType = new Accept <> (12);
		System.out.println("Integer type is : "+intType.getData());
		
		Accept<Double> doubleType = new Accept <> (12.0);
		System.out.println("Double type is : "+doubleType.getData());

		Accept<Character> charType = new Accept <> ('A');
		System.out.println("char type is : "+charType.getData());

		Accept <Student> student = new Accept <>(new Student(111,"sritam"));
		System.out.println("student type is : "+student.getData());
	}

}
class Student{
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}