package com.company.array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class AlternateSort {
    public static ArrayList<Long> alternateSort(long arr[] ,int N)
    {
        Arrays.sort(arr);
        int n=arr.length;
        ArrayList<Long> list=new ArrayList<>();
        for(int max=n-1,min=0;max>=min;max--,min++){
            if(max!=min){
                list.add(arr[max]);
                list.add(arr[min]);

            }else{
                list.add(arr[max]);
            }
        }
        return list;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scan.nextInt();
        long[] arr = new long[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextLong();
        }
        ArrayList<Long> list=alternateSort(arr,size);
        System.out.println(list);
    }
}
