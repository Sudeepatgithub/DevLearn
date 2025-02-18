package ds_algo.sorting;

public class BucketSort {
    public static void sortColors(int[] nums) {
        int count[]=new int[3];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int idx=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                nums[idx++]=i;
            }
        }
    }

    public static void main(String[] args) {
        BucketSort.sortColors(new int[]{3,4,2,1,0,6,7});
    }
}
