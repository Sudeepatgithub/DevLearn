package DataStructuresAndAlgorithms.SinglyLinkedList;

import java.util.Stack;

public class PalindromeList {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        SinglyList singlyList = new SinglyList(1);
        singlyList.addData(2);
        singlyList.addData(3);
        singlyList.addData(3);
        singlyList.addData(2);
        singlyList.addData(1);
        Node temp = singlyList.getHead();
        while (temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        temp = singlyList.getHead();
        boolean flag = true;
        while (temp!=null){
            if(stack.pop()!=temp.data){
                flag = false;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
