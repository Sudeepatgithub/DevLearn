package ds_algo.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{6,5,1,2,0,3,4})));
    }

    public static int[] bubbleSort(int arr[]){
        int n =arr.length;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
