package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BonApetite {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n =scanner.nextInt();
        int k = scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int  payment = scanner.nextInt();
        int sum = Arrays.stream(arr).sum();
        int notPay = arr[k];
        int amount = (sum-notPay)/2;
        if(amount<payment){
            System.out.println(payment-amount);
        }else {
            System.out.println("Bon Appetit");
        }
    }
}
