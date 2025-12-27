package com.exam.nit;
public class VotingEligibilityCustomException{
    void main(){
        try{
        int age = Integer.parseInt(IO.readln("enter age"));
        String str=null;
        InvalidAgeException i =new InvalidAgeException(str);
            i.checkAge(age);
        }
        catch(InvalidAgeException e){
            IO.println(e.getMessage());
        }
        catch(NumberFormatException e){
            IO.println("Invalid input. Please enter a valid number.");
        }
    }
}
class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
    super(str);
    }
    
    public void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Exception caught: Age "+age+" is not valid. Must be at least 18 to vote.");
        }
        else{
            IO.println("Eligible to vote.");
        }
    }
    }