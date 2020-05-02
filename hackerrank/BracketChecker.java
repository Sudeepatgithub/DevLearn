package hackerrank;

import java.util.Scanner;

public class BracketChecker {

    static String isBalanced(String s) {

        boolean istrue = true;
        for(int i=0;i<s.length();i++){
            if(Math.abs(s.charAt(i)-s.charAt(s.length()-i-1))<=2){

            }else {
                istrue = false;
            }
        }
        if(istrue) {
            return "YES";
        }else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }

    class Sudeep{
        void callFinalize() throws Throwable {
            finalize();
        }
    }
}
