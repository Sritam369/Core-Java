import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
     int arr[]= {12,21,21,23};
     
     for(int i=0;i<arr.length;i++) {
    	 for(int j=i+1;j<arr.length;j++) {
    		 if(arr[i]==arr[j]) {
    			 arr[j]=-1;
    		 }
    	 }
     }
     for(int i=0;i<arr.length;i++) {
    	 if(arr[i]!=-1) {
    		 IO.print(arr[i]);
    	 }
     }
     
    }
}