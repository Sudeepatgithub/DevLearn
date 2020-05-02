package geeks4geeks.arrays;


import java.util.Scanner;

/*
Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases.
 Then T testcases follow. Each testcases contains two lines of input.
 The first line denotes the size of the array N.
 The second lines contains the elements of the array A separated by spaces.

Output:
For each testcase, print the sorted array.
 */
public class Sort012Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int q = 0; q < t; q++) {
            int n = scanner.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            int low=0,mid=0,high=n-1;
            while (mid<high){

            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    static void swap(int arr[],int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
