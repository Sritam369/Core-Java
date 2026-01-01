package com.sri.array;

public class CommonElementInTwoArrays {
  void main() {
	  int arr1[]= {1,3,4,7,9,10};
	  int arr2[]= {2,3,7,6,9,12};
	  for(int i=0;i<arr1.length;i++) {
		  for(int j=0;j<arr2.length;j++) {
			  if(arr1[i]==arr2[j]) {
				 IO.println(arr2[j]); 
			  }
		  }
			  
	  }
  }
}
