package DataStructuresAndAlgorithms.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MIssingNumberInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int q=0;q<t;q++){
            int n = scanner.nextInt();
            int arr[]=new int[n];
            int sum = 0;
            for(int k=0;k<n-1;k++){
                arr[k] = scanner.nextInt();
                sum=sum+k+1;
            }
            sum=sum+n;
            int arrSum = Arrays.stream(arr).sum();
            System.out.print(sum-arrSum);
        }
    }
}
