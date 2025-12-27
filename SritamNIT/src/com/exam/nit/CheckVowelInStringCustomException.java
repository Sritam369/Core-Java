package com.exam.nit;

public class CheckVowelInStringCustomException {
	 void main(){
		    String str = IO.readln("enter a string");
		    NovowelsException n =new NovowelsException(str);
		    try{
		          n.checkException(str);
		    }
		    catch(NovowelsException e){
		        IO.println(e.getMessage());
		    }
		  }
}
class NovowelsException extends Exception{
    public NovowelsException(String x){
        super(x);
    }
    public  void checkException(String x) throws NovowelsException{
        boolean isPresent=false;
        for(int i=0;i<=x.length()-1;i++){
            if(x.charAt(i)=='a' || x.charAt(i)=='e' ||
x.charAt(i)=='i'||x.charAt(i)=='o'|| x.charAt(i)=='u'){
            	 IO.println("The string contains vowels.");
                 isPresent=true;
                 return;
             }
             }
            if(isPresent==false){
                 throw new NovowelsException("Exception caught: The string does not  contain any vowels!");
         }
     }
    }