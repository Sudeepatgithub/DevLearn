package data_structures_algorithms.arrays;

import java.util.Scanner;

public class EquilibriumPoint {
    public static void main(String[] data) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int q=0;
        while (q<t){
            q++;
            int n = scanner.nextInt();
            int arr[]=new int[n];
            int sumLeft=0,sumRight=0;
            int k=n-1;
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
                sumRight+=arr[i];
            }
            boolean gotit=false;
           for (int i=0;i<n;i++){
                sumRight=sumRight-arr[i];
                if(sumLeft==sumRight){
                    System.out.println(i+1);
                    gotit=true;
                }
                sumLeft +=arr[i];
           }
           if(!gotit){
               System.out.println("-1");
           }
        }
    }
}
