package CrackingTheCodingInterview.ArrayAndStrings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZeroMatrix {
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
        checkForZeros(arr);
    }

    private static void checkForZeros(int arr[][]) {
        Set<Integer> setRow = new HashSet<>();
        Set<Integer> setColumn = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(arr[i][j]==0){
                    setRow.add(i);
                    setColumn.add(j);
                }
            }
        }
        for(int i =0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(setColumn.contains(j) || setRow.contains(i)) {
                    System.out.print(0 + " ");
                }else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
