package ds_algo.arrays;

import java.util.Scanner;

//Dutch National Flag Problem

public class Sort012Array {
    public static void main(String[] data) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int q = 0; q < t; q++) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int mid = 0;
            int high = arr.length-1;
            int low = 0;
            while (mid<=high){
                int current = arr[mid];
                switch (current) {
                    case 0:
                        swap(arr,mid,low);
                        low++;
                        mid++;
                        break;
                    case 1:
                        mid++;
                        break;
                    case 2:
                        swap(arr,high,mid);
                        high--;
                        break;
                }
            }
            for (int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

    private static void swap(int arr[], int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
