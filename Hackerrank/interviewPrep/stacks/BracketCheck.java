package Hackerrank.interviewPrep.stacks;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BracketCheck {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            switch (ch){
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(stack.size()!=0) {
                        if (stack.peek() == '(' && ch == ')') {
                            stack.pop();
                            continue;
                        } else if (stack.peek() == '[' && ch == ']') {
                            stack.pop();
                            continue;
                        } else if (stack.peek() == '{' && ch == '}') {
                            stack.pop();
                            continue;
                        } else {
                            flag = false;
                            break;
                        }
                    }else {
                        break;
                    }
            }
        }
        if(flag) return "YES";
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println(isBalanced("[()][{}()][](){}([{}(())([[{}]])][])"));
    }
}

