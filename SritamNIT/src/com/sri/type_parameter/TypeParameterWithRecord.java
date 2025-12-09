package com.sri.type_parameter;

class Accepts <T>{
	private T data;
	public Accepts(T data) {
		this.data=data;
	}
	public T getData() {
		return this.data;
	}
}

public class TypeParameterWithRecord {

	public static void main(String[] args) {
		Accepts<Integer> intType = new Accepts <> (12);
		System.out.println("Integer type is : "+intType.getData());
		
		Accepts<Double> doubleType = new Accepts<> (12.0);
		System.out.println("Double type is : "+doubleType.getData());

		Accepts<Character> charType = new Accepts <> ('A');
		System.out.println("char type is : "+charType.getData());

		Accepts <Students> student = new Accepts <>(new Students(111,"sritam"));
		System.out.println("student type is : "+student.getData());
	}

}
record Students(int id,String name){}

