package CrackingTheCodingInterview.StacksAndQueues;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackWithMin{

    Node start;
    Node min;
    Stack<Integer> minStack = new Stack<>();
    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
    }
    void push(int data){
        Node node = new Node(data);
        if(data<min()){
            minStack.push(node.data);
        }
        if(start==null){
            start = node;
        }else {
            node.next = start;
            start = node;
        }
    }
    int pop(){
        if(start!=null){
            int d = start.data;
            start = start.next;
            if(d==min()){
                minStack.pop();
            }
            return d;
        }else {
            throw new EmptyStackException();
        }

    }
    int min(){
        return minStack.peek();
    }


}
