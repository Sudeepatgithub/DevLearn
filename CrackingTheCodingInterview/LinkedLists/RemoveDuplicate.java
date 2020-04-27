package CrackingTheCodingInterview.LinkedLists;

import java.util.HashSet;
import java.util.Hashtable;

public class RemoveDuplicate {
    public static void main(String[] args) {
        MyLinkedList linkedList  = new MyLinkedList(10);
        linkedList.addData(2);
        linkedList.addData(3);
        linkedList.addData(5);
        linkedList.addData(19);
        linkedList.addData(2);
        linkedList.addData(4);
        linkedList.addData(20);
        linkedList.addData(19);
        linkedList.printOriginalList();
        HashSet<Integer> set = new HashSet<>();
        Node head = linkedList.getHead();
        set.add(head.data);
        while (head!=null && head.next!=null){
            if(set.contains(head.next.data)){
                head.next = head.next.next;
            }
            set.add(head.data);
            head = head.next;
        }
        System.out.println();
        linkedList.printOriginalList();
    }
}
