package com.sri.basic;

import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        
        for (; num >= 10; ) {
            int sum = 0;

            
            for (int temp = num; temp != 0; temp /= 10) {
                sum += temp % 10;
            }

            num = sum;  
        }

        System.out.println("Digital Root = " + num);
        sc.close();
    }
}