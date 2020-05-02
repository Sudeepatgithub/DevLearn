package leet_code;

public class TwiceAsLarge_747 {

    public static void main(String[] args) {
        TwiceAsLarge_747 twiceAsLarge747 = new TwiceAsLarge_747();
        System.out.println(twiceAsLarge747.dominantIndex(new int[]{3,6,1,0}));
    }

    public int dominantIndex(int[] nums) {
        int max = 0, index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=index && nums[i]*2>max){
                return -1;
            }
        }
        return index;
    }
}

