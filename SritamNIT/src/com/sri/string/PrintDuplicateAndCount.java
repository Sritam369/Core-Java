package com.sri.string;

import java.util.Scanner;

public class PrintDuplicateAndCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        char[] s = str.toCharArray();

        for (int i = 0; i < s.length; i++) {
            int c = 0;
            if (s[i] == '*') continue;
            for (int j = 0; j < s.length; j++) {
                if (s[i] == s[j]) {
                    c++;
                }
            }
            if (c > 1) {
                System.out.println(s[i] + " occurs " + c + " times");
            }
            
            for (int j = i; j < s.length; j++) {
                if (s[i] == s[j]) {
                    s[j] = '*';
                }
            }
        }
        sc.close();
    }
}