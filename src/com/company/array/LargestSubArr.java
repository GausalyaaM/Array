package com.company.array;

import java.util.Scanner;

public class LargestSubArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        int maxSum = arr[0];
        for (int i = 0; i < size; i++) {
            int subSum = 0;
            for (int j = i; j < size; j++) {
                subSum = subSum + arr[j];
                if (subSum >= maxSum) {
                    maxSum = subSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
