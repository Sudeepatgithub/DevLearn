package ds_algo.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{5,3,7,0,1,2,})));
    }

    public static int[] insertionSort(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<=n-1; i++) {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }
}
