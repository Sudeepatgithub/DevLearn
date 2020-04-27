package Hackerrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GiftProblem{

    /*
     * Complete the giftBoxes function below.
     */
    static int giftBoxes(String g, String c) {
    	int count =0;
    	if(c.equals(g)) {
    		return 1;
    	}else {
    		String copy = "";
    		for(int i=0;i<c.length();i++) {
    			copy += c.charAt(i);
    		
    		//	String copy = c.substring(i,i+g.length());
    			int index = copy.indexOf(g);
    			if(index!=-1) {
    				copy = copy.substring(0,index)+copy.substring(index+g.length(),copy.length());
    				count++;
    			}
    		}
    	}
		return count;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       

        int t = Integer.parseInt(scan.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String g = scan.nextLine();

            String c = scan.nextLine();

            int result = giftBoxes(g, c);

           System.out.println(result);
        }

    }
}

