package cracking_the_coding_interview.LinkedLists;

import java.util.Scanner;

public class PartitionLinkedList {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(3);
        linkedList.addData(5);
        linkedList.addData(8);
        linkedList.addData(5);
        linkedList.addData(10);
        linkedList.addData(2);
        linkedList.addData(1);
        linkedList.addData(6);
        linkedList.addData(-2);
        linkedList.addData(53);
        linkedList.addData(5);
        linkedList.addData(6);
        Node head = linkedList.getHead();
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        traverseAndCreateNewListMethod1(head,p,linkedList);
        traverseAndCreateNewListMethod2(head,p,linkedList);
    }

    private static void traverseAndCreateNewListMethod2(Node top, int p, MyLinkedList linkedList) {
        Node head = top
                ,tail = top;
        while (top!=null){
            Node newNode = new Node(top.data);
            if(top.data<p){
                newNode.next = head;
                head = newNode;
            }else {
                tail.next = newNode;
                tail = newNode;
            }
            top=top.next;
        }
        tail.next = null;
        linkedList.printMyList(head);
    }

    private static void traverseAndCreateNewListMethod1(Node head, int p, MyLinkedList linkedList) {
        Node lesser=null,  greater=null;
        Node lesserStart = null;
        Node greaterStart = null;
        while (head!=null){
            if(head.data<=p){
                if(head.data==p){
                    head = head.next;
                    continue;
                }
                if(lesser==null) {
                    lesser = new Node(head.data);
                    lesserStart = lesser;
                }else {
                    lesser.next = new Node(head.data);
                    lesser = lesser.next;
                }
            }else {
                if(greater==null) {
                    greater = new Node(head.data);
                    greaterStart = greater;
                }else {
                    greater.next = new Node(head.data);
                    greater = greater.next;
                }
            }
            head = head.next;
        }
        Node center = new Node(p);
        lesser.next = center;
        center.next = greaterStart;
        linkedList.printMyList(lesserStart);
    }
}
