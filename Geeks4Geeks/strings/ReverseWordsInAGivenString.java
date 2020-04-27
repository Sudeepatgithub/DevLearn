package aaGeeks4Geeks.strings;

/*
Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.

Input:
The first line contains T denoting the number of testcases. T testcases follow.
Each case contains a string S containing characters.

Output:
For each test case, in a new line, output a single line containing the reversed String.
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr
*/

import java.util.Scanner;

public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int q=0;q<t;q++){
            String str = scanner.next();
            String arr[]=str.split("\\.");
            str="";
            for(int i=arr.length-1;i>0;i--){
                str+=arr[i]+".";
            }
            str+=arr[0];
            System.out.println(str);
        }
    }
}
