package cracking_the_coding_interview.ArrayAndStrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Strings1or2OperationsAway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if(str1.equals(str2)){
            System.out.println("0 Edits");
        }
        int diffCounter = 0;
        if(Math.abs(str1.length()-str2.length())>1){
            System.out.print("More Edits Away");
            System.exit(10);
        }
        Map<Character,Integer> map = new HashMap<>();
        int minLen =str2.length();
        boolean isStr1Lower = false;
        if(str1.length()<str2.length()){
            isStr1Lower = true;
            minLen = str1.length();
        }
        int q=0,m=0;
        for(int i=0;i<minLen;i++) {
            char c1 = str1.charAt(q);
            char c2 = str2.charAt(m);
            if (str1.length() == str2.length()) {
                if (c1 != c2) {
                    diffCounter++;
                }
                if(diffCounter>1){
                    System.out.println("More than one difference");
                    break;
                }
            }else {
                if(c1!=c2)
                if(isStr1Lower){
                    if(c1==str2.charAt(m+1)){
                        m++;
                        diffCounter++;
                        if(diffCounter>1){
                            System.out.println("More than one difference");
                            break;
                        }
                    }else {
                        System.out.print("Different");
                        System.exit(10);
                    }
                }else {
                    if(c2==str1.charAt(q+1)){
                        q++;
                        diffCounter++;
                        if(diffCounter>1){
                            System.out.println("More than one difference");
                            break;
                        }
                    }else {
                        System.out.print("Different");
                        System.exit(10);
                    }
                }
            }
            q++;
            m++;
        }
        if(diffCounter==1||diffCounter==0){
            System.out.print("Yes");
        }
    }
}
