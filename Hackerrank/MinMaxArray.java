package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArray {
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        int size = arr.length;
        long n1= arr[0],n2 = arr[size-1];
        long sum =0;
        for(int i =0;i<size;i++) {
        	sum+=arr[i];
        }
        System.out.print(sum-n2+" ");
        System.out.println(sum-n1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
