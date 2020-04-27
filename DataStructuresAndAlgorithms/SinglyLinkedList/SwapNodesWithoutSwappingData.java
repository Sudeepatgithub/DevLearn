package DataStructuresAndAlgorithms.SinglyLinkedList;

public class SwapNodesWithoutSwappingData {
    public static void main(String[] args) {
        SinglyList linkedList = new SinglyList(4);
        linkedList.addData(2);
        linkedList.addData(3);
        linkedList.addData(6);
        linkedList.addData(8);
        linkedList.addData(7);
        linkedList.addData(10);
        linkedList.addData(20);
        linkedList.addData(25);
        swapNodes(2,25,linkedList.getHead());
    }

    private static void swapNodes(int node1, int node2,Node head) {
        Node tempA = head, tempB = head,tempAPrev, tempBPrev;
       // while ()
    }
}
