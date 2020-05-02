package cracking_the_coding_interview.ArrayAndStrings;

import java.util.Scanner;

public class MakingAnagrams {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int arr[]=new int[26];
        int brr[]=new int[26];
        for(int i=0;i<a.length();i++){
            arr[a.charAt(i)-'a']+=1;
        }
        for(int i=0;i<b.length();i++){
            brr[b.charAt(i)-'a']+=1;
        }
        int count =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==brr[i]){
                continue;
            }
            if(arr[i]>brr[i]){
                count+=arr[i]-brr[i];
            }else {
                count+=brr[i]-arr[i];
            }
        }
        System.out.print(count);
    }
}
