package hackerrank;

import java.util.Scanner;

public class DiagonalDifference {

    static int diagonalDifference(int[][] a,int n) {
        int sum1=0,sum2=0;
         for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                if(a_i==a_j){
                    sum1+=a[a_i][a_j];
                }
                if(n-1-a_i==a_j){
                    sum2+=a[a_i][a_j];
                }
            }
        }
        return Math.abs(sum1-sum2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a,n);
        System.out.println(result);
        in.close();
    }
}
