
public class AddFirstAndLast {
  void main() {
	  int size = Integer.parseInt(IO.readln("enter size"));
	   int arr[]=new int[size];
	   for(int i=0;i<size;i++) {
		   int value = Integer.parseInt(IO.readln("enter "+i+" element"));
		   arr[i]=value;		   
	   }
	   int result=0;
	   for(int i=0;i<arr.length;i++) {
		    result = arr[0]+arr[arr.length-1];
	   }
	   IO.println(result);
  }
}
