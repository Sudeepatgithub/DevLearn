package DsAlgo.sorting;

public class MergeSort {

    public static void sort(int[] arr, int start, int end) {
        if(end <= start){
            return;
        }
        int mid = (start+end)/2;
        sort(arr,start,mid);
        sort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int tempArray[] = new int[end-start+1];
        int leftStart = start;
        int k=0;
        int rightStart = mid + 1;
        while (leftStart<=mid && rightStart<=end) {
            if (arr[leftStart] <= arr[rightStart]) {
                tempArray[k++] = arr[leftStart++];
            }else {
                tempArray[k++] = arr[rightStart++];
            }
        }
        if(leftStart <= mid){
            while (leftStart<=mid){
                tempArray[k++] = arr[leftStart++];
            }
        }else if(rightStart <= end){
            while (rightStart<=end){
                tempArray[k++] = arr[rightStart++];
            }
        }

        for (int i=0;i<tempArray.length;i++){
            arr[start+i]= tempArray[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3,6,2,1,8,7,4,5,2,3};
        sort(arr,0,9);
        for (int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}
