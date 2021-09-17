package com.company.array;

import java.util.Scanner;

public class Increament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array1 elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int num = 0;
        for (int i = 0; i < size; i++) {
            num = num * 10 + arr[i];
        }
        int inc=num+1;
        System.out.println(num);
        System.out.println(inc);
        int arr1[]=new int[size+1];
        int k=0;
        //for(int i=size-1;i>0;i--){
        while(inc>0){
            int rem=inc%10;
            arr1[k++]=inc%10;
            inc/=10;
        }
        for(int i=k-1;i>=0;i--){
            System.out.print(arr1[i]+" ");
        }
    }
}