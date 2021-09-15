package com.company.array;
import java.util.Scanner;
    public class MinElement {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of an array:");
            int size = sc.nextInt();
            System.out.println("Enter the array elements:");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            int low = 0, high = size - 1;
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == arr[high]) {
                    high--;
                }
                else if(arr[mid]>arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid;
                }
            }
            System.out.println(arr[high]);
        }
    }
