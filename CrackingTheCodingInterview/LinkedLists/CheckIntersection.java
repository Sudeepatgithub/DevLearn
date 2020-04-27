package CrackingTheCodingInterview.LinkedLists;

import java.util.HashSet;
import java.util.Set;

public class CheckIntersection {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(1);
        linkedList.addData(2);
        linkedList.addData(3);
        linkedList.addData(5);
        linkedList.addData(19);
        linkedList.addData(2);
        linkedList.addData(4);
        linkedList.addData(20);

        MyLinkedList linkedList1 = new MyLinkedList(12);
        linkedList1.addData(19);
        linkedList1.addData(22);
        linkedList1.addData(41);
        linkedList1.addData(20);

        Node node = new Node(100);
        linkedList.addNode(node);
        linkedList1.addNode(node);

        linkedList.addData(33);
        linkedList1.addData(33);

        linkedList.printOriginalList();
        linkedList1.printOriginalList();
        Set<Node> nodes = new HashSet<>();
        Node head1=linkedList1.getHead();
        System.out.println(head1.data);
        Node head2 = linkedList.getHead();
        System.out.println(head2.data);
        while (head1.next!=null){
            nodes.add(head1);

            head1=head1.next;
        }
        while (head2.next!=null){
            if(nodes.contains(head2)){
                System.out.print(head2.data);
                break;
            }
            head2 = head2.next;
        }
    }
}
