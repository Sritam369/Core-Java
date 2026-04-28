package com.sri.array;

public class TCS4 {

	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3,4};
		for(int i=0;i<arr.length;i++) {
			int c = 0;
			for(int j=0;j<arr.length;j++) {
			  if(arr[i] == arr[j]) {
				 c++; 
			  }
			}
			if(c>1) {
				arr[i]='$';
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!='$') {
				IO.print(arr[i]);
			}
		}

	}

}
