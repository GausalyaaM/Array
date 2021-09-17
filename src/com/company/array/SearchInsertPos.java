package com.company.array;

import java.util.Scanner;

public class SearchInsertPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array1 elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.println(i);
            } else if (target > arr[i] && target < arr[i + 1]) {
                System.out.println(i + 1);
            } else if (target > arr[size - 1]) {
                System.out.println(size);
            }
        }
    }}
