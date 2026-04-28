package com.sri.array;

public class TCS3 {

	public static void main(String[] args) {
		int arr[] = {1,2,4,5};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=arr[i]+1;j<arr[i+1];j++) {
				IO.println(j);
			}
		}
	}

}
