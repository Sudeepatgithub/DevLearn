package CrackingTheCodingInterview.LinkedLists;

public class DeleteOnlyAccessableNodeInList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(1);
        linkedList.addData(2);
        linkedList.addData(3);
        linkedList.addData(5);
        linkedList.addData(19);
        linkedList.addData(2);
        Node head = linkedList.getHead();
        for(int i=0;i<2;i++){
            head = head.next;
        }
        linkedList.printOriginalList();
        deleteNode(head,linkedList);
    }

    private static void deleteNode(Node node,MyLinkedList list) {
        if(node==null || node.next==null){
            return;
        }else {
            node.data =node.next.data;
            node.next  = node.next.next;
        }
        list.printOriginalList();
    }
}
