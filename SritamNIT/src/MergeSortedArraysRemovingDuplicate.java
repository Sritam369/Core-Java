import java.util.Arrays;

public class MergeSortedArraysRemovingDuplicate {

	public static void main(String[] args) {
		int arr[]= {1,2,5};
		int brr[]= {2,4,6};
		int crr[]=new int[arr.length+brr.length];
		int x=0;
		for(int i=0;i<arr.length;i++) {
			crr[x++]=arr[i];
		}
		for(int i=0;i<brr.length;i++) {
			crr[x++]=brr[i];
		}
		System.out.println(Arrays.toString(crr));
		for(int i=0;i<crr.length;i++) {
			for(int j=i+1;j<crr.length;j++) {
				if(crr[i]==crr[j]) {
					crr[j]=-1;
				}
			}
			
		}
		System.out.println(Arrays.toString(crr));
		System.out.print("[");
		boolean first=true;
		for(int i=0;i<crr.length;i++) {
		if(crr[i]!=-1) {
			if(!first) {
				System.out.print(",");
			}
			System.out.print(crr[i]);
			first=false;
		}
		
		}
		System.out.print("]");
	}

}
