package geeks4geeks.linkedlist;

public class MiddleOfList {
    public static void main(String[] args) {
        SinglyList linkedList = new SinglyList(4);
        linkedList.addData(2);
        linkedList.addData(3);
        linkedList.addData(5);
        linkedList.addData(19);
        linkedList.addData(2);
        linkedList.addData(4);
        linkedList.addData(20);
        linkedList.addData(20);
        int value = findMiddle(linkedList.getHead());
        System.out.println(value);
    }

    private static int findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
}
