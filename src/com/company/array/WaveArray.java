package com.company.array;

import java.util.Scanner;

public class WaveArray {
        public static void convertToWave(int arr[], int n){
            //Arrays.sort(arr);
            if(n%2!=0)
            {
                for(int i=0;i<n-1;i+=2){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                }
            }else{
                for(int i=0;i<n;i+=2){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                }
            }
            for(int i=0;i<n;i++)
            System.out.println(arr[i]);
        }
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the size of an array:");
            int size = scan.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = scan.nextInt();
            }
            convertToWave(arr,size);
    }
}
