package com.company.array;
import java.util.HashMap;
import java.util.Scanner;

    public class NonRepeat {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of an array:");
            int size = sc.nextInt();
            System.out.println("Enter the array elements:");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<size;i++){
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                }
                else{
                    map.put(arr[i],1);
                }
            }
            for(int i=0;i<size;i++){
                if(map.get(arr[i])==1) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

