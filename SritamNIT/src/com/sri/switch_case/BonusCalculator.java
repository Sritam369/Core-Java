package com.sri.switch_case;

import java.util.Scanner;

public class BonusCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Grade of performance is: ");
		char grade=sc.nextLine().toUpperCase().charAt(0);
        double salary=10000;
        double bonus=switch(grade) {
        case 'A'-> {System.out.println("Grade A performer");
        yield salary*10/100;}
        case 'B'-> {System.out.println("Grade B performer");
        yield salary*5/100;
        }
        default->0.0;
        };
        System.out.println("your bonus is "+bonus);
        sc.close();
	}

}
