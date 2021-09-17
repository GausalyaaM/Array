package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallNthLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array1 elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K:");
        int K = sc.nextInt();
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        Arrays.sort(arr);
        int sum=0;
        sum+=arr[K-1];
        sum+=arr[size-N];
        System.out.println(sum);
    }
}
