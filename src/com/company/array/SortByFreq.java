package com.company.array;
import java.util.Scanner;

public class SortByFreq
    {
        public static int search(int A[],  int n, int key)
        {
            for(int i=0;i<=n;i++)
            {
                if(key==A[i])
                    return i;
            }
            return -1;
        }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=scan.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the key:");
        int key=scan.nextInt();
        int result=search(arr,size,key);
        System.out.println(result);
    }
}
