import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int arr[]= {1,3,5};
		int brr[]= {2,4,6};
		int crr[]=new int[arr.length+brr.length];
		int x=0,i=0,j=0;
		for(;i<arr.length && j<brr.length;x++) {
			if(arr[i]<brr[j]) {
				crr[x]=arr[i];
				i++;
			}
			else {
				crr[x]=brr[j];
				j++;
			}
		}
		if(i<arr.length) {
			crr[x++]=arr[i];
		}
		else {
			crr[x++]=brr[j];
		}
		
		
		System.out.println(Arrays.toString(crr));
	}

}
