package com.sri.string;

public class ReverseSentence {

	public static void main(String[] args) {
		String str = "hello i am sritam";
		String s[] = str.split(" ");
		for(int i=0;i<s.length;i++) {
			String word=s[i];
			for(int j=word.length()-1;j>=0;j--) {
				System.out.print(word.charAt(j));
			}
			
		}

	}

}
