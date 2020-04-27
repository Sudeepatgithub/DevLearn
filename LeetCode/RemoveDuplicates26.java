package LeetCode;

public class RemoveDuplicates26 {
    public static void main(String[] args) {
        RemoveDuplicates26 removeDuplicates26 = new RemoveDuplicates26();
        System.out.println(removeDuplicates26.removeDuplicatesModArray(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public int removeDuplicates(int[] nums) {       //Without modifying array
        int len = 1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            len++;
            while (num == nums[i] && i < nums.length - 1) {
                i++;
            }
        }
        return len;
    }

    public int removeDuplicatesModArray(int[] nums){
        if(nums.length==0) return 0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==nums[i]){
                continue;
            }
            i++;
            nums[i]=nums[j];
        }
        return i+1;
    }

}
