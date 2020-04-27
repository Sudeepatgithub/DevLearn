/*
Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

Input:
The first line of input contains an integer T denoting the number of test cases.
Then T test cases follow. Each test case consists of two lines.
 The first line of each test case is N and S, where N is the size of array and S is the sum.
 The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each testcase, in a new line,
 print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray,
 else print -1.

2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10

 */

//Sliding Bracket Method

package Geeks4Geeks.arrays;
import java.util.Scanner;

public class SubarrayWithGivemSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t = scanner.nextInt();
        for (int q=0;q<t;q++){
            int n =scanner.nextInt();
            int s = scanner.nextInt();
            int arr[]=new int[n];
            int sum =0;
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            int end = 0;
            int j=0;
            boolean found = false;
            for(int i=0;i<n;i++) {
                if (!found) {
                    sum += arr[i];
                    if (sum == s) {
                        end = i + 1;
                        found = true;
                    }
                    if (sum > s) {
                        while (sum > s) {
                            sum -= arr[j++];
                        }
                        if (sum == s) {
                            end = i + 1;
                            found = true;
                        }
                    }
                }else {
                    break;
                }
            }
            if(found){
                System.out.println(j+1+" "+ end);
            }else {
                System.out.println("-1");
            }
        }
    }
}
