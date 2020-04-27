package Hackerrank;

import java.util.Scanner;

public class AppleOranges {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int result=0;
        boolean isOrangeMore = false;
        int size=apples.length;
        if(oranges.length>s){
            isOrangeMore = true;
            size = oranges.length;
        }
        int countOrange=0,countApple=0;
        for(int i=0;i<size;i++){
            if(isOrangeMore) {
                int dropOrgane = oranges[i] + b;
                if(i<apples.length) {
                    int dropApple = apples[i] + a;
                    if (dropApple >= s && dropApple <= t) {
                        countApple++;
                    }
                }
                if (dropOrgane >= s && dropOrgane <= t) {
                    countOrange++;
                }
            }else{
                int dropApple = apples[i] + a;
                if (dropApple >= s && dropApple <= t) {
                    countApple++;
                }
                if(i<oranges.length) {
                    int dropOrgane = oranges[i] + b;
                    if (dropOrgane >= s && dropOrgane <= t) {
                        countOrange++;
                    }
                }
            }
        }
        System.out.print(countApple+" "+countOrange);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
