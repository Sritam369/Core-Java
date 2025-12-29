
public class ReverseArray {
  void main() {
	  int size = Integer.parseInt(IO.readln("enter size"));
	   int arr[]=new int[size];
	   for(int i=0;i<size;i++) {
		   int value = Integer.parseInt(IO.readln("enter "+i+" element"));
		   arr[i]=value;		   
	   }
	   for(int j=arr.length-1;j>=0;j--) {
		   IO.print(arr[j]);
	   }
  }
}
