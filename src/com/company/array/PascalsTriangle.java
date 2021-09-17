package com.company.array;
import java.util.Scanner;
public class PascalsTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        int prev=1;
        System.out.print(prev);
        for(int i=1;i<=size;i++){
            int curr=(prev*(size-i+1))/i;
            System.out.print(","+curr);
            prev=curr;
        }
    }
}
