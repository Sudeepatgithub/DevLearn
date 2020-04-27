package DataStructuresAndAlgorithms.SinglyLinkedList;

public class DeleteANode {
    public static void main(String[] args) {
        SinglyList linkedList = new SinglyList(4);
        linkedList.addData(2);
        linkedList.addData(3);
        linkedList.addData(5);
        linkedList.addData(19);
        linkedList.addData(2);
        linkedList.addData(4);
        linkedList.addData(20);
        linkedList.printOriginalList();

        linkedList.printMyList(linkedList.deleteNode(20));
       /* Node deleted = deleteNode(19,linkedList.getHead());
        linkedList.printMyList(deleted);*/
    }

/*    private static Node deleteNode(int i, Node head) {
        if(head!=null) {
            Node current = head.next;
            Node previous = head;
            if(previous.data==i){
                return head;
            }else {
                while (current!=null){
                    if(current.data == i){
                        previous.next = current.next;
                    }
                    current = current.next;
                    previous=previous.next;
                }
            }
        }
        return head;
    }*/
}
