package com.exam.nit;

public class CheckWithBipredicate {
void main(){
 int age = Integer.parseInt(IO.readln("Enter age"));
 int exp = Integer.parseInt(IO.readln("Enter experience"));
 Bipredicate<Integer,Integer> demo = (a,b)-> a>=21 && b>=2;
 IO.println("Age is above or equals to 21 and experience is minimum 2 years : "+demo.test(age,exp));
 }
}

  interface Bipredicate<T,U>{
  boolean test(T X, U y);
 }


