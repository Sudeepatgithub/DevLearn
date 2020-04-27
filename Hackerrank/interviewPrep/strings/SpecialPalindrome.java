package Hackerrank.interviewPrep.strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SpecialPalindrome {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        Map<Character,Integer> map = new HashMap<>(100);
        for(int i=0;i<n;i++){
            int count = map.get(s.charAt(i))!=null ? map.get(s.charAt(i)):0;
            map.put(s.charAt(i),count+1);
        }
        int total = n;

        return 0l;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        substrCount(7,"abcdddd");
    }
}
