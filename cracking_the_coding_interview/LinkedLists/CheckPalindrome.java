package cracking_the_coding_interview.LinkedLists;

public class CheckPalindrome {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(3);
        linkedList.addData(5);
        linkedList.addData(8);
        linkedList.addData(5);
        linkedList.addData(3);
        Node head = linkedList.getHead();
        Node reverseHead = reverseList(head);
        linkedList.printMyList(reverseHead);
        boolean reverseIs= checkifSame(reverseHead,head);
        System.out.print(reverseIs);
    }

    private static boolean checkifSame(Node reverseHead, Node head) {
        while (reverseHead!=null && head!=null){
            if(reverseHead.data!=head.data){
                return false;
            }
            head=head.next;
            reverseHead=reverseHead.next;
        }
        return true;
    }

    private static Node reverseList(Node head) {
        Node newHead = null;
        while(head!=null){
            Node newNode = new Node(head.data);
            newNode.next=newHead;
            newHead = newNode;
            head = head.next;
        }
        return newHead;
    }
}
