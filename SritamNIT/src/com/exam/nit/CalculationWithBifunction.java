/*Program Requirements:
Accept two integer inputs from the user.
Use a BiFunction<Integer, Integer, Double> to:
Add the two integers.
Apply additional business logic:
If the sum is greater than 100, add a 10% bonus.
Deduct a 5% tax from the final amount.
Return the final result as a double, demonstrating automatic widening conversion (int
double).
Display the final calculated value.
*/

package com.exam.nit;
import java.util.Scanner;
public class CalculationWithBifunction {

	 void main(){
	 Scanner sc = new Scanner(System.in);
	 IO.println("Enter first number");
	 int a = sc.nextInt();
	 IO.println("Enter second number");
	 int b = sc.nextInt();
	 Bifunction<Integer,Integer,Double> check = (x,y)->{
	 double result = x+y;
	 double res=0.0;
	 if(x<0){
	 return 0.0;
	 }
	 else if(result>100){
		 res = result+(result*10/100);
		 return res-(res*5/100);
		 }

		 else{
		 return result-(result*5/100);
		 }
		 };
		 IO.println(check.apply(a,b));
		 sc.close();
		}
		}
		interface Bifunction<T , U , R>{
		 R apply (T x , U y);
		}

