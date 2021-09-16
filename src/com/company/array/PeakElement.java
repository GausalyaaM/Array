package com.company.array;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array1 elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int i=0;
        if(size==1)
            System.out.println(i);
        if(arr[0]>=arr[1])
            System.out.println(i);
        if(arr[size-1]>=arr[size-2])
            System.out.println(size-1);
        for(i=1;i<=size-1;i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                System.out.println(i);
            }
        }
    }
}
