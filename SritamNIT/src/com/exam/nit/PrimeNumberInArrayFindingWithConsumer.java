/*Use the Consumer<int[]> functional interface.
Implement the logic using a lambda expression.
The Consumer should:
Take an integer array as input.
Identify prime numbers from the array.
Display all prime numbers.
Do not create any extra methods for prime checking.*/

package com.exam.nit;
import java.util.Scanner;

public class PrimeNumberInArrayFindingWithConsumer {
 void main(){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter size of the array");
 int size = Integer.parseInt(sc.nextLine());
 Integer arr[]=new Integer[size];
 
 for(int i=0;i<size;i++){
  System.out.println("Enter "+i+" index value");
 arr[i]=sc.nextInt();
 }
 IO.print("Prime numbers are: ");
 Consumer<Integer> check = a -> {

 for(int i=0;i<a.length;i++){
 int c=0;
 for(int j=1;j<=a[i];j++){
 if(a[i]%j==0){
 c++;
 }
 }
 if(c==2){
 IO.print(a[i]+" ");
 }
 }
 };
 check.accept(arr);
 sc.close();
 }
}
interface Consumer<T>{
 void accept(T x[]);
}


