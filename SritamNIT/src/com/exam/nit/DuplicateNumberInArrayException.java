package com.exam.nit;
import java.util.Scanner;
public class DuplicateNumberInArrayException{
  void main(){
    Scanner sc = new Scanner(System.in);
    IO.println("enter size");
    int size = Integer.parseInt(sc.nextLine());
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
    	IO.println("enter value");
        int value = Integer.parseInt(sc.next());
        arr[i]=value;
    }
    String str=null;
    DuplicateNumberException d = new DuplicateNumberException(str);
    try{
        d.check(arr);
    }
    catch(DuplicateNumberException e){
        IO.println(e.getMessage());
    }
  }
}
class DuplicateNumberException extends Exception{
    public DuplicateNumberException(String x){
          super(x);
    }
    public void check(int arr[]) throws DuplicateNumberException{
        boolean isPresent=false;
         for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
      if(c>1){
      isPresent=true;
      throw new DuplicateNumberException("Exception in thread main DuplicateNumberException: Duplicate number found: " +arr[i]);
            }
         }
         if(isPresent==false){
            IO.println("No duplicate numbers found.");
         }
    }
} 