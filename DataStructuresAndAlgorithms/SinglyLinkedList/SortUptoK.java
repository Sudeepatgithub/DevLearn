package DataStructuresAndAlgorithms.SinglyLinkedList;

import java.io.*;
import java.util.*;

public class SortUptoK {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.print(node.data+" ");

            node = node.next;
        }
    }
    /*
     * Complete the sortList function below.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode sortList(SinglyLinkedListNode head, int k) {
        /*
         * Write your code here.
         */
        SinglyLinkedListNode temp = head;
        int i = 0;
        if (temp == null) {
            return temp;
        }
        SinglyLinkedListNode point = null;
        int arr[]=new int[k];
        while (temp.next != null && i < k) {
            arr[i] = temp.data;
            if(i==k-1){
                point=temp;
            }
            temp=temp.next;
            i++;
        }
        Arrays.sort(arr);
        SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode(arr[0]);
        i=1;
        while (i<arr.length){
            singlyLinkedListNode.next = new SinglyLinkedListNode(arr[i]);
            i++;
            singlyLinkedListNode = singlyLinkedListNode.next;
        }
        singlyLinkedListNode.next = point;
        printSinglyLinkedList(singlyLinkedListNode);
        return singlyLinkedListNode;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scanner =new Scanner(System.in);

        SinglyLinkedList head = new SinglyLinkedList();

        int headCount = scanner.nextInt();

        for (int headItr = 0; headItr < headCount; headItr++) {
            int headItem = scanner.nextInt();

            head.insertNode(headItem);
        }

        int k = scanner.nextInt();

        SinglyLinkedListNode res = sortList(head.head, k);

        scanner.close();
    }
}


