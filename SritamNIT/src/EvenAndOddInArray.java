import java.util.Arrays;

public class EvenAndOddInArray {
	void main() {
		  int size = Integer.parseInt(IO.readln("enter size"));
		   int arr[]=new int[size];
		   for(int i=0;i<size;i++) {
			   int value = Integer.parseInt(IO.readln("enter "+i+" element"));
			   arr[i]=value;		   
		   }
		   int e=0,o=0;
		for(int i=0;i<arr.length;i++) {   
			if(arr[i]%2==0) {
				e++;
			}
			else {
				o++;
			}
		}
		int even[]=new int[e];int x=0;
		int odd[]=new int[o];int y=0;
		for(int i=0;i<arr.length;i++) {   
			if(arr[i]%2==0) {
				even[x++]=arr[i];
			}
			else{
			 odd[y++]=arr[i];	
			}
	}
		IO.println("even elements are: "+Arrays.toString(even));
		IO.println("odd elements are : "+Arrays.toString(odd));
	}
}
