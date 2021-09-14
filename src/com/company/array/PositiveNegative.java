package com.company.array;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]>=0)
                System.out.print(arr[i]);
            else if(arr[i]<0)
                System.out.print(arr[i]);
        }
}}
