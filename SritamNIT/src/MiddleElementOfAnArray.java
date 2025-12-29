
public class MiddleElementOfAnArray {
	void main() {
		  int size = Integer.parseInt(IO.readln("enter size"));
		   int arr[]=new int[size];
		   for(int i=0;i<size;i++) {
			   int value = Integer.parseInt(IO.readln("enter "+i+" element"));
			   arr[i]=value;		   
		   }
		   int c=0;
		   for(int i=0;i<arr.length;i++) {
			   c++;
		   }
		   for(int i=0;i<arr.length;i++) {
			  if(c%2==0) {
				  IO.println(arr[arr.length-1]/2);
				  IO.println((arr[arr.length-1]/2)+1);
				  return;
			  }
			  else {
				  IO.println((arr[arr.length-1]/2)+1);
				  return;
			  }
		   }
	}
}
