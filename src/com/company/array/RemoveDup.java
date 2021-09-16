package com.company.array;

import java.util.Scanner;

public class RemoveDup {
    public static void remove_duplicate(int A[], int N) {
        int k = 0;
        for (int i = 0; i < N - 1; i++) {
            if (A[i] != A[i + 1]) {
                A[k++] = A[i];
            }
        }
        A[k++] = A[N - 1];
        //return k;
        for(int i=0;i<k;i++){
            System.out.println(A[k]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scan.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        remove_duplicate(arr, size);
        //int result = remove_duplicate(arr, size);
        //System.out.println(result);
    }
}
