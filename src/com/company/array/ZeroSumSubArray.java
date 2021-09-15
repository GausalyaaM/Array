package com.company.array;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

    public class ZeroSumSubArray{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of an array:");
            int size = sc.nextInt();
            System.out.println("Enter the array elements:");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            boolean bool=findsum(arr,size);
            System.out.println(bool);
        }
        public static boolean findsum(int arr[],int n)
        {
            int sum=0;
            Set<Integer> hs=new HashSet<>();
       /* boolean val=false;
        for(int i=0;i<n;i++){
            int subSum=0;
            int j=i;
            while(j<n){
            //for(int j=i;j<n;j++){
                subSum=subSum+arr[j];
                if(subSum==sum){
                     val=true;
                }
                j++;
            }
        }*/
            for(int i=0;i<n;i++){
                sum+=arr[i];
                if(arr[i]==0||sum==0||hs.contains(sum)){
                    return true;
                }
                hs.add(sum);
            }
            return false;
        }
    }

