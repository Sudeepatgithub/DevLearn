package cracking_the_coding_interview.LinkedLists;

public class ReverseLinkedList {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(1);
        linkedList.addData(2);
        linkedList.addData(3);
        linkedList.addData(5);
        linkedList.addData(19);
        linkedList.addData(2);
        linkedList.addData(4);
        linkedList.addData(20);
        Node node = reverseList(linkedList.getHead());
        linkedList.printMyList(node);
    }

    private static Node reverseList(Node head) {
        Node newHead = null;
        while (head!=null){
            Node newNode = new Node(head.data);
            newNode.next = newHead;
            newHead = newNode;
            head = head.next;
        }
        return newHead;
    }
}
