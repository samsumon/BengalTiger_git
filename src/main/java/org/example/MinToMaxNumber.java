package org.example;

import java.util.Arrays;

public class MinToMaxNumber {
    public static void main(String[] args) {
        int arr[] = {2,5,3,7,8};
        int min1 = Arrays.stream(arr).min().getAsInt();
        int max1 = Arrays.stream(arr).max().getAsInt();
        System.out.println("Min = " + min1);
        System.out.println("Max = " + max1);
    }
}
