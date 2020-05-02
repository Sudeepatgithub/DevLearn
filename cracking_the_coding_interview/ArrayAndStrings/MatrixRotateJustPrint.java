package cracking_the_coding_interview.ArrayAndStrings;

import java.util.Scanner;

public class MatrixRotateJustPrint {

    static void print(int arr[][]){
        for(int i =0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int arr[][]=new int[r][c];
        for(int i =0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
             arr[i][j]=scanner.nextInt();
            }
        }
        print(arr);
        System.out.println();
        rotate(arr);
    }

    private static void rotate(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=0;j--){
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
