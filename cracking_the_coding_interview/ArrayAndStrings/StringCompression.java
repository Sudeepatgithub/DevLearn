package cracking_the_coding_interview.ArrayAndStrings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str.length());
        int charCount = 1;
        for(int i=0;i<str.length();i++){
            if((i+1)>=str.length()||str.charAt(i)!=str.charAt(i+1)){
                stringBuilder.append(str.charAt(i)+""+charCount);
                charCount =1;
            }else {
                charCount++;
            }
        }
        if(stringBuilder.length()<str.length()){
        System.out.print(stringBuilder.toString());}
        else {
            System.out.print(str);
        }
    }
}
