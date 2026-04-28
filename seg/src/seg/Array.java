package seg;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		int brr[] = {3,4,5};
        int c = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<brr.length;j++) {
				if(arr[i]==brr[j]) {
					c=c+2;
					brr[j]='*';
					arr[i]='*';
				}
			}
		}
		int crr[] = new int[arr.length+brr.length-c];
		IO.println(crr.length);
		int x = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!='*') {
			crr[x++]=arr[i];
			}
		}
		for(int i=0;i<brr.length;i++) {
			if(brr[i]!='*') {
			crr[x++]=brr[i];
			}
		}
		IO.println(Arrays.toString(crr));
	}

}
