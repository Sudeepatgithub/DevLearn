package Hackerrank;


import java.util.Scanner;
import java.util.Stack;


public class BracketCheckerv2 {

    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            switch (ch){
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    if(!stack.isEmpty() && stack.pop() !='('){
                        return "NO";
                    }
                    break;
                case '}':
                    if(!stack.isEmpty()&& stack.pop() !='{'){
                        return "NO";
                    }
                    break;
                case ']':
                    if(!stack.isEmpty() && stack.pop() !='['){
                        return "NO";
                    }
                    break;
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}