package DataStructuresAndAlgorithms.arrays;

import java.util.Scanner;

public class ParticularSumInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int q = 0; q < t; q++) {
            int n = scanner.nextInt();
            int sum = scanner.nextInt();
            int arr[] = new int[n];
            for (int k = 0; k < n; k++) {
                arr[k] = scanner.nextInt();
            }
            int sum_crr = arr[0];
            int start=0;
            for (int i = 1; i < n; i++) {
                if(sum_crr==sum){
                 System.out.println((start+1)+" "+(i+1));
                }
                while (sum_crr>sum && start<=i){
                    sum_crr-=arr[start++];
                }
                sum_crr += arr[i];
            }
            //System.out.println((k+1)+" "+(start+1));
        }
    }
}
