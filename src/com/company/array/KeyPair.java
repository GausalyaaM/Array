package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class KeyPair {
    public static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] + arr[right] == x) {
                return true;
            } else if (arr[left] + arr[right] < x) {
                left++;

            } else {
                right--;
            }
        }
        return false;
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
        System.out.println("Enter the key:");
        int key = sc.nextInt();
        boolean bool = hasArrayTwoCandidates(arr, size, key);
        System.out.println(bool);
    }
}
