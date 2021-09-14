package com.company.array;

import java.util.Scanner;

public class MinDistance {
        public static int minDist(int arr[], int n, int x, int y)
        {
            int i=0,p=-1, min_dist=Integer.MAX_VALUE;
            for(i=0 ; i<n ; i++)
            {
                if(arr[i] ==x || arr[i] == y)
                {
                    if(p != -1 && arr[i] != arr[p])
                        min_dist = Math.min(min_dist,i-p);
                    p=i;
                }
            }
            if(min_dist==Integer.MAX_VALUE)
                return -1;
            return min_dist;
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the size of an array:");
            int size = scan.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = scan.nextInt();
            }
            System.out.println("Enter the value of x:");
            int x= scan.nextInt();
            System.out.println("Enter the value of y:");
            int y= scan.nextInt();
            int result=minDist(arr,size,x,y);
            System.out.println("Minimum distance between " + x + " and " + y
                    + " is " + result);
        }
    }

