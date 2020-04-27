package CrackingTheCodingInterview.ArrayAndStrings;

import java.util.Scanner;

public class MatrixRotateWithSwap {
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
        System.out.print(arr.length);
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
        int layers = arr.length/2;
        for(int layer = 0;layer<layers;layer++){
            int first = layer;
            int last = arr.length-1-layer;
            for (int i=first;i<last;i++){
                int offset = last;
            }
        }
    }
}
