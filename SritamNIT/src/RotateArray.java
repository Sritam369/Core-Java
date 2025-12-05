import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int k=3;
		for(k=1;k<=3;k++) {
			int x = arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=x;
		}
		System.out.println(Arrays.toString(arr));

	}

}
