package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class ElectronicShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int k = keyboards.length-1;
        int d = drives.length-1;
        if(keyboards[0]+drives[0]>s){
            return -1;
        }else {
            int max = Integer.MIN_VALUE;
            int i=k;
            while (keyboards[i]>s){
                i--;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
