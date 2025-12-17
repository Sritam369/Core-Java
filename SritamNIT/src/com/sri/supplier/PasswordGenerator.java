/*Create a Java program using the Supplier interface to generate random passwords. The password should be 8 characters long.

Contain a mix of uppercase letters, lowercase letters, digits, and special characters (e.g., @, #, $, !).

Coding  Requirements:
Create a PasswordGenerator class.

Inside the main method :

Define character sets [For password generation as shown below]

 String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 String lower = "abcdefghijklmnopqrstuvwxyz";
 String digits = "0123456789";
 String special = "@#$%!&*";

Combine all the character set into a single String

Define a Supplier<String> named passwordSupplier which will generate and return a Random Password (Using all character set) by using java.util.Random class.

Use this supplier to generate and print a random secure password.

Output :

Generated Password: Ab3#eT9!
*/


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
