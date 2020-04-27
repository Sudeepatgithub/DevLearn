package DataStructuresAndAlgorithms.strings;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (checkPalindrome(str)){
            System.out.print("Palindrome");
        }else {
            System.out.print("Not Palindrome");
        }
    }

    private static boolean checkPalindrome(String str) {
        int i=0,j=str.length()-1;
        while (i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
}
