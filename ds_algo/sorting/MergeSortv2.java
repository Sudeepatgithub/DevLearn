package ds_algo.sorting;

public class MergeSortv2 {
    public static void main(String[] args) {
        int arr[]=new int[]{3,2,1,5,9,6,5};
        mergeSort(arr,0,6);
        System.out.println(arr);
    }

    public static void mergeSort(int arr[], int low, int high){
        if(high-low+1<=1){
            return;
        }
        int mid = (high-low)/2;
        mergeSort(arr,low, mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[], int low, int mid, int high) {
        int temp[]=new int[20];
        int left = low;
        int right = mid+1;
        int t=0;
        while (left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp[t++]=arr[left];
                left++;
            }else{
                temp[t++]=arr[right];
                right++;
            }
        }
        while(left<=mid){
            temp[t++]=arr[left++];
        }
        while (right<=high){
            temp[t++]=arr[right++];
        }
        for(int i=low;i<=high;i++){
            arr[low+i] = temp[i];
        }
    }
}
