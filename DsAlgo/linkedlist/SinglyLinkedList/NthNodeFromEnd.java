package DsAlgo.linkedlist.SinglyLinkedList;

public class NthNodeFromEnd {

    public static void main(String[] args) {
        SinglyList singlyList = new SinglyList(1);
        singlyList.addData(2);
        singlyList.addData(3);
        singlyList.addData(3);
        singlyList.addData(5);
        singlyList.addData(1);
        Node temp = singlyList.getHead();
        int len = 0;
        while (temp!=null){
            len++;
            temp = temp.next;
        }
        int val = findNthByLength(2,singlyList.getHead(),len);
        System.out.println(val);
        val = findNthBy2Pointers(2,singlyList.getHead(),len);
        System.out.print(val);
    }

    private static int findNthBy2Pointers(int i, Node head, int len) {
        Node p1 = head,p2=head;
        int count =0;
        while (count<i){
            p1=p1.next;
            count++;
        }
        while (p1!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2.data;
    }

    private static int findNthByLength(int i,Node head,int len) {
        int count =0;
        while (head!=null && count<len-1){
            if(count==len-i){
                break;
            }
            count++;
            head = head.next;
        }
        return head.data;
    }
}
