package seg;

import java.util.Arrays;

public class CheckIntegerBetween1ToN {

	public static void main(String[] args) {
		int arr[] = {1,1,1,1,1,1,0,0,1,1,1,1,1};
		int c = 0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==1 && arr[i+1]==1) {
				c++;
			}
		}
		IO.println(c);
	}

}
