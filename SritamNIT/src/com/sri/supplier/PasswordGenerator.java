package com.sri.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerator {

	public static void main(String[] args) {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String special = "@#$%!&*";
		String s1 = upper+lower+digits+special;
		
		Random r = new Random();
		Supplier<String> passwordSupplier = () -> {;
		  String result = "";
		  for(int i=1;i<=8;i++) {
			  result+=s1.charAt(r.nextInt(s1.length()));
		  }
		  return result;
		};
		IO.println(passwordSupplier.get());

	}

}
