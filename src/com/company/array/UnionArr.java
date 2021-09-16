package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class UnionArr {
    public static int doUnion(int a[], int n, int b[], int m)
    {
        int[] arr3=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            arr3[k++]=a[i];
        }
        for(int i=0;i<m;i++){
            arr3[k++]=b[i];
        }
        Arrays.sort(arr3);
        int l=0;
        for(int i=0;i<k-1;i++){
            if(arr3[i]!=arr3[i+1]){
                arr3[l++]=arr3[i];
            }
        }
        arr3[l++]=arr3[k-1];
        return l;
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
        System.out.println("Enter the size of an array:");
        int size1 = sc.nextInt();
        System.out.println("Enter the array2 elements:");
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        /*int[] arr3 = new int[size + size1];
        int i = 0, j = 0, k = 0;
        while (i < size && j < size1) {
            if (arr[i] < arr1[j])
                arr3[k++] = arr[i++];
            else
                arr3[k++] = arr1[j++];
        }
        while (i < size)
            arr3[k++] = arr[i++];
        while (j < size1)
            arr3[k++] = arr1[j++];
        System.out.print("The merged array is:");
        for (k = 0; k < size + size1; k++) {
            System.out.print(arr3[k]+" ");
        }*/
        int output=doUnion(arr,size,arr1,size1);
        System.out.println(output);
    }
}