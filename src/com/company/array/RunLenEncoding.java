package com.company.array;

import java.util.Scanner;

public class RunLenEncoding {
    public static String encode(String str)
    {
        String res="";
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;

            }
            res+=""+str.charAt(i)+count;
        }
        return res;
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        String output=encode(str);
        System.out.println(output);
}}
