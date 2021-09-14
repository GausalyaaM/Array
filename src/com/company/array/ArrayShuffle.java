package com.company.array;

import java.util.Scanner;

public class ArrayShuffle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the segregate value:");
        int n = scan.nextInt();
        for(int i=0,j=n;i<n;i++,j++){
            System.out.print(arr[i]+" ");
            System.out.print(arr[j]+" ");
        }
    }
}
