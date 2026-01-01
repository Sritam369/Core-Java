package com.sri.array;

import java.util.Arrays;

public class InsertingElementInTheMiddle {
    public static void main(String[] args) {
        int size = Integer.parseInt(IO.readln("enter size"));
        int arr[] = new int[size];
        
        IO.println("enter " + size + " values");
        for (int i = 0; i < size; i++) {
            int value = Integer.parseInt(IO.readln("enter " + (i + 1) + " value"));
            arr[i] = value;
        }

        int target = Integer.parseInt(IO.readln("enter element to be inserted"));
        int pos = (arr.length-1) / 2;       
        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        
        newArr[pos] = target;
       
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        IO.println("Array after insertion: " + Arrays.toString(newArr));
    }
}