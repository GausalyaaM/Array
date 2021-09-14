package com.company.array;
import java.util.Scanner;

public class Leaders {
    /*public  static void printLeaders()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=scan.nextInt();
        System.out.println("Enter the elements of an array:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == size)
                System.out.print(arr[i] + " ");
        }}*/
    //class LeadersInArray
   // {

       public static void printLeaders(int arr[], int size)
        {
            int max_from_right =  arr[size-1];
            System.out.print(max_from_right + " ");

            for (int i = size-2; i >= 0; i--)
            {
                if (max_from_right < arr[i])
                {
                    max_from_right = arr[i];
                    System.out.print(max_from_right + " ");
                }
            }
        }

public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of an array:");
    int size = scan.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter array elements:");
    for (int i = 0; i < size; i++) {
        arr[i] = scan.nextInt();
    }
    printLeaders(arr,size);
   // printLeaders();
}}