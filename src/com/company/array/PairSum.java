package com.company.array;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter the size of an array:");
            int size = scan.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++){
                arr[i] = scan.nextInt();}
        System.out.println("Enter the sum:");
        int sum = scan.nextInt();
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if((arr[i]+arr[j])==sum){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
