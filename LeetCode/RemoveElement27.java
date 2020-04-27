package LeetCode;

public class RemoveElement27 {

    public static void main(String[] args) {
        RemoveElement27 removeElement27 = new RemoveElement27();
        System.out.println(removeElement27.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
