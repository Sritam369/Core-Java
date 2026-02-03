package com.sri.stream_api;

import java.util.Arrays;

public class FilterPrimeNumber {
  void main() {
	  int[] num = {2,3,4,5,6,7,8,9,10,11,13};
	  int[] prime = Arrays.stream(num).filter(nums-> FilterPrimeNumber.isPrime(nums)).toArray();
	  IO.println(Arrays.toString(prime));
  }
  
  private static boolean isPrime(int num) {
	  if(num<2) {
		  return false;
	  }
	  int c = 0;
	  for(int i=1;i<=num;i++) {
		  if(num%i==0) {
			  c++;
		  }
	  }
	  if(c==2) {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
}
