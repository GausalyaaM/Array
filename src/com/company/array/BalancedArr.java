package com.company.array;

import java.util.Scanner;

public class BalancedArr {
    public static long minValueToBalance(long a[] ,int n) {
        int m = n / 2;

        int leftSum = 0, rightSum = 0;
        long result;
        for (int i = 0; i < m; i++) {
            leftSum += a[i];
        }
        for (int i = m; i < n; i++) {
            rightSum += a[i];
        }
        if (leftSum == rightSum) {
            result = 0;
            //System.out.println("balanced!");
        } else if (leftSum < rightSum) {
            result = rightSum - leftSum;
        } else {
            result = leftSum - rightSum;
        }
        return result;

    }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of an array:");
    int size = scan.nextInt();
    long[] arr = new long[size];
    System.out.println("Enter array elements:");
    for (int i = 0; i < size; i++) {
        arr[i] = scan.nextLong();
    }
    long output=minValueToBalance(arr,size);
        System.out.println(output);

}}
