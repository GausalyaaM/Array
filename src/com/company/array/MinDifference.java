package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class MinDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        //for(int i=0;i<size;i++)
          //  System.out.println(arr[i]);
        int diff = 0;
        int min = (int) (arr[size-1] - arr[size-2]);
        //System.out.println((min));
        for (int i =size-1; i >0; i--) {
            for (int j = i-1; j >0; j--) {
                    diff = arr[i] - arr[j];
                    if (diff <= min) {
                        min = diff;
                    }
                }

            }
        System.out.println(min);
    }
}