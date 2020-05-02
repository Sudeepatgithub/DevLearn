package geeks4geeks.arrays;

/*
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Input:
The first line of input contains an integer T denoting the number of test cases.
The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.

Constraints:
 */

import java.util.Scanner;

public class ContigousMaxSumKadanesAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int q = 0; q < t; q++) {
            int n = scanner.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            int max_so_far = Integer.MIN_VALUE;
            int curr_sum=0;
            for(int i=0;i<n;i++){
                curr_sum+=arr[i];
                if(curr_sum>max_so_far){
                    max_so_far = curr_sum;
                }
                if(curr_sum<0){
                    curr_sum=0;
                }
            }
            System.out.println(max_so_far);
        }
    }
}
