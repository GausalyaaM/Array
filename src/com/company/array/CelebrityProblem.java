package com.company.array;
import java.util.Scanner;
public class CelebrityProblem {
        public static int celebrity(int M[][], int n)
        {
            int[] arr=new int[n];
            int[] arr1=new int[n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int x=M[i][j];
                    arr[i]+=x;
                    arr1[j]+=x;
                }
            }
            for(int i=0;i<n;i++){
                if(arr1[i]==n-1 && arr[i]==0){
                    return i;
                }
            }
            return -1;
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = scan.nextInt();
        System.out.println("Enter the number of columns:");
        int col = scan.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int result=celebrity(matrix,row);
        System.out.println(result);
    }
}
