package com.sri.array;

import java.util.Arrays;

public class TCS2 {

    public static void main(String[] args) {
        int arr[] = {5, 7, 0, 2, 0, 4};

        int j = 0; // position for non-zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}