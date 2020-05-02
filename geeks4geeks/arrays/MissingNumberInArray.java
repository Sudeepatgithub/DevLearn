package geeks4geeks.arrays;

/*
Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing,
the missing number is to be found.

Input:
The first line of input contains an integer T denoting the number of test cases.
For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

Output:
Print the missing number in array.
 */

import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int q=0;q<t;q++){
            int n = scanner.nextInt();
            int arr_sum = 0;
            int sum=0;
            int arr[]=new int[n];
            for(int i=0;i<n-1;i++){
                arr[i]=scanner.nextInt();
                arr_sum+=arr[i];
                sum+=(i+1);
            }
            sum+=n;
            System.out.println(sum-arr_sum);
        }
    }
}
