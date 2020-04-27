package CrackingTheCodingInterview.ArrayAndStrings;

public class SecondHighest {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int max1= Integer.MIN_VALUE;
        int max2  = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int num =arr[i];
            if(num>max1){
                max2 = max1;
                max1 = num;
            }else if(num>max2){
                max2 = num;
            }
        }
        System.out.println(max1 +" "+ max2);
    }
}
