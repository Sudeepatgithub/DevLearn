package ds_algo.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{3,8,4,5,1,2})));
    }

    public static int[] selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIdx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        return arr;
    }
}
