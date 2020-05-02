package geeks4geeks.linkedlist;

import java.util.HashSet;

public class DeleteDuplicateInSortedList {
    public static void main(String[] args) {
        SinglyList linkedList = new SinglyList(4);
        linkedList.addData(2);
        linkedList.addData(3);
        linkedList.addData(3);
        linkedList.addData(3);
        linkedList.addData(7);
        linkedList.addData(10);
        linkedList.addData(20);
        linkedList.addData(25);
        linkedList.printMyList(deleteDuplicates(linkedList.getHead()));
       Node ret =  deleteDuplicatesUsingHashing(linkedList.getHead());
       linkedList.printMyList(ret);
    }

    private static Node deleteDuplicatesUsingHashing(Node head) {
        HashSet<Integer> hashSet = new HashSet<>(10);
        Node retNode = head;
        Node prev = head;
        Node currrent = head.next;
        hashSet.add(prev.data);
        while (currrent!=null) {
            if (hashSet.contains(currrent.data)) {
                prev.next = currrent.next;
            }
            hashSet.add(currrent.data);
            currrent = currrent.next;
            prev = prev.next;
        }
        return retNode;
    }

    private static Node deleteDuplicates(Node head) {
        if(head==null){
            return null;
        }
        Node copy = head;
        while (head.next!=null){
            Node next_next = head.next.next;
            if(head.data == head.next.data){
                head.next = next_next;
            }else {
                head = head.next;
            }
        }
        return copy;
    }
}
