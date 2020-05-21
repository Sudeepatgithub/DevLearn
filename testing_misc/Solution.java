package testing_misc;

public class Solution {
    public static String rotThirteen(String input) {
        // Your code goes here
        StringBuilder bp= new StringBuilder();
        for(int i=0;i<input.length();i++)
        {
            char l=input.charAt(i);
            if(l>='a' && l<='m')
                l+=13;
            else if(l>='A' && l<='M')
                l+=13;
           else if(l>='n' && l<='z')
                l-=13;
            else if(l>='N' && l<='Z')
                l-=13;

            bp.append(l);
        }
        return bp.toString();
    }

    public static void main(String[] args) {
        System.out.println(rotThirteen("Hello"));
    }
}