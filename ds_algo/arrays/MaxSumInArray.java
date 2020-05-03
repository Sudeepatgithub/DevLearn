package ds_algo.arrays;

import java.util.Scanner;

public class MaxSumInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for (int q = 0; q < k; q++) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
            for(int i=0;i<n;i++){
                max_ending_here += arr[i];
                if(max_so_far<max_ending_here){
                    max_so_far = max_ending_here;
                }
                if(max_ending_here<0){
                    max_ending_here = 0;
                }
            }
            System.out.println(max_so_far);
        }
    }
}
