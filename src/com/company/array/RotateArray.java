package com.company.array;
import java.util.Scanner;
public class RotateArray {
    public static void leftRotatebyOne(int arr[], int n)
{
    int temp = arr[0];
    for (int i = 0; i < n - 1; i++)
        arr[i] = arr[i + 1];
    arr[n-1] = temp;
}
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=scan.nextInt();
        System.out.println("Enter the number size of the rotation:");
        int numSize=scan.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i < numSize; i++)
            leftRotatebyOne(arr, size);
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
