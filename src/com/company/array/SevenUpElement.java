package com.company.array;

import java.util.Scanner;

public class SevenUpElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array1 elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[0]);
        for(int i=1;i<size-1;i++){
            if(arr[i]%7==0){
                System.out.println(arr[i+1]);
            }
        }
}
}

