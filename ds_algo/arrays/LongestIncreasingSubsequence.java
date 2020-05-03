package ds_algo.arrays;

import java.util.Scanner;

public class LongestIncreasingSubsequence {

    public static void main(String[] data) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for(int q=0;q<t;q++){
            int n= scanner.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            int sum=arr[0];
            for (int i=1;i<n;i++){
                if(arr[i]>arr[i-1]){
                    sum+=arr[i];
                }
                else sum=0;
            }
            System.out.println(sum);
        }
    }
}
