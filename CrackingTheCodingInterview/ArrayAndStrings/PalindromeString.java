package CrackingTheCodingInterview.ArrayAndStrings;

import java.util.HashMap;
import java.util.Map;

//If string is permutation of any palindrome

public class PalindromeString {
    public static void main(String[] args) {
        String str = "feeef";
        HashMap<Character,Integer> map = new HashMap<>(128);
        for (int i=0;i<str.length();i++){
            map.put(str.charAt(i),(map.get(str.charAt(i))!=null?map.get(str.charAt(i)):0)+1);
        }
        int sum2 = 0,sumOdd=0;
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()%2==0){
                sum2++;
            }else {
                sumOdd++;
            }
        }
        if ((sumOdd==1 && sum2!=0)){
            System.out.print("Palindrome");
        }
    }
}
