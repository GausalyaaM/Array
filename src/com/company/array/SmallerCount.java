package com.company.array;
import java.util.Scanner;
public class SmallerCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        int[] count = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i] > arr[j]){
                    (count[i])++;}
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(count[i] + " ");
        }
    }
}
