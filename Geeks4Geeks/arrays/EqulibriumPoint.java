package Geeks4Geeks.arrays;

import java.util.Scanner;

public class EqulibriumPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int q = 0; q < t; q++) {
            int n = scanner.nextInt();
            int arr[]=new int[n];
            int totalSum=0;
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
                totalSum+=arr[i];
            }
            int lsum=0,rSum=0;
            int k=0;
            boolean flag =false;
            for (int i=0;i<n;i++){
                lsum+=arr[i];
                if(lsum==totalSum){
                    flag = true;
                    k=i;
                    break;
                }
                totalSum-=arr[i];
            }
            if(flag){
                System.out.println(k+1);
            }else {
                System.out.println("-1");
            }
        }
    }
}
