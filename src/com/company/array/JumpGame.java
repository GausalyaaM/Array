package com.company.array;

import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array1 elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int end=0,farthest=0,jump=0;
        for(int i=0;i<size-1;i++){
            farthest=Math.max(farthest,i+arr[i]);
            if(i==end){
                jump++;
                end=farthest;
            }
        }
        System.out.println(jump);
    }
}

