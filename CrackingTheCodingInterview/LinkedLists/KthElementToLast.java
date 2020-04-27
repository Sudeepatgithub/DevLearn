package CrackingTheCodingInterview.LinkedLists;

import java.util.Scanner;

public class KthElementToLast {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(1);
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        linkedList.addData(2);
        linkedList.addData(3);
        linkedList.addData(5);
        linkedList.addData(19);
        linkedList.addData(2);
        linkedList.addData(4);
        linkedList.addData(20);
        Node p1=linkedList.getHead(),
                p2=linkedList.getHead();

        for(int i=0;i<k;i++){
            p2 = p2.next;
        }
        while (p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        System.out.print(p1.data);
    }
}
