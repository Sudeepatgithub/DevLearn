package DsAlgo.strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for(int q=0;q<t;q++){
            String str = scanner.next();
            String arr[]=str.split(".");
            int i =0,k=arr.length-1;
            while (i<=k){
                String temp =arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
                k--;
            }
            Arrays.stream(arr).forEach(word->print(word));
        }

    }

    private static void print(String word) {
        System.out.print(word+".");
    }
}
