package com.sri.stream_api;

import java.util.Arrays;

public class PallindromeInArray {
  void main() {
	  String[] words = {"madam","hello","racecar","java","level","world"};
	  Object[] arr = Arrays.stream(words).filter(w->PallindromeInArray.pallindrome(w)).toArray();
	  IO.println(Arrays.toString(arr));
  }
  
  public static boolean pallindrome(String s) {
	  String s2 ="";
	  for(int i=s.length()-1;i>=0;i--) {
		  s2 += s.charAt(i);
	  }
	  if(s.equals(s2)) {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
}
