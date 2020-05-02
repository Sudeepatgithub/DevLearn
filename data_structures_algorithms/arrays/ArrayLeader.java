package data_structures_algorithms.arrays;

import java.util.Scanner;
import java.util.Stack;

/*
Write a program to print all the LEADERS in the array.
An element is leader if it is greater than all the elements to its right side.
The rightmost element is always a leader.
*/

public class ArrayLeader {
    public static void main(String[] data) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int q = 0;
        while (q < t) {
            q++;
            int n = scanner.nextInt();
            int arr[] = new int[n];
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int max=0;
            for(int i=n-1;i>=0;i--){
                if(i==n-1){
                    stack.push(arr[i]);
                    max = arr[i];
                }
                if(arr[i]>max && (i!=n-1)){
                    max = arr[i];
                    stack.push(max);
                }
            }
            int size = stack.size();
            for(int i=0;i<size;i++){
                System.out.print(stack.pop()+" ");
            }
            System.out.println();
        }
    }
}
