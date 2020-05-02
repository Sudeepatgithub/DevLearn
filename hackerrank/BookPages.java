package hackerrank;

import java.util.*;

public class BookPages {

    static int solve(int n, int p) {
        boolean isEven = true;
        if (n % 2 != 0) {
            isEven = false;
        }
        if (n - p >= p) {
            //Start from 0
            int diff = p;
            if(p%2==0){
                isEven = true;
            }else {
                isEven = false;
            }

            if (isEven) {
                return (diff - 2) / 2 + 1;
            } else {
                return (diff - 1) / 2 + 1;
            }
        } else {
            int diff = n-p;
            if (isEven) {
             return (diff-2)/2 +2;
            }else {
                return (diff-1)/2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}