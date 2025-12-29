
public class SearchElementInArray {
   void main() {
	   int size = Integer.parseInt(IO.readln("enter size"));
	   int arr[]=new int[size];
	   for(int i=0;i<size;i++) {
		   int value = Integer.parseInt(IO.readln("enter "+i+" element"));
		   arr[i]=value;		   
	   }
	   int ele = Integer.parseInt(IO.readln("enter element to search"));
	   boolean isFound=false;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]==ele) {
			   IO.println("Element found at index "+i+"");
			   isFound=true;
			   return;
		   }
	   }
	   if(isFound==false) {
		   IO.println("Element not found");
	   }
   }
}
