package com.sri.static_nested_class;

	class Outside{
		 int x=15;
		static class Inside{
			 void msg() {
				 Outside out = new Outside();
				System.out.println("x value is : "+out.x);
			}
		}
	}
	public class Test2{
	public static void main(String[] args) {
		Outside.Inside in = new Outside.Inside();
		in.msg();

	}

}
