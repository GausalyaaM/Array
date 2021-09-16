package com.company.array;
import java.util.Scanner;
public class IndexOfExtra {
    public static int findExtra(int a[], int b[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != b[i]) {
                return i;
            }
        }
        return n - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array1 elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the array2 elements:");
        int[] arr1 = new int[size-1];
        for (int i = 0; i < size-1; i++) {
            arr1[i] = sc.nextInt();
        }
        int result = findExtra(arr, arr1, size);
        System.out.println(result);
    }
}
