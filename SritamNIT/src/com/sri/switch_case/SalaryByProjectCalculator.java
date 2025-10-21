package com.sri.switch_case;

import java.util.Scanner;

public class SalaryByProjectCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
        double salary=sc.nextDouble();
        System.out.println("enter project");
        int project=sc.nextInt();
        
        double bonus=switch(project) {
        case 5,6,7,8,9,10 -> { yield salary+=5000;
        }
        case 11,12,13,14,15,16,17,18,19,20->{
        	yield salary+=10000;
        }
        case 0,1,2,3,4 -> salary;
        
        default -> salary+=15000;
        };
        System.out.println("total salary is"+bonus);
        sc.close();
	}
     
    
}
