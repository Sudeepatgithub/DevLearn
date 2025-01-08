package ds_algo.linkedlist;

public class CircularList {

    private Node first;
    private Node last;

    public CircularList() {
        first = last = null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
        if(isEmpty()){
            last = newNode;
        }
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            first = last = newNode;
        }else {
            last.next = newNode;
            last = newNode;
        }
    }

    public int deleteFirst(){
        int data = first.data;
        if(first.next==null){
            last = null;
        }
        first = first.next;
        return data;
    }

    public int deleteLast(){
        Node current = first;
        if(isEmpty()){
            return -999;
        }
        if(first.next==null){
            last = first=null;
        }else {

            while (current.next.next!=null){
                current = current.next;
            }
            current.next = null;
            last = current;
        }
        return current.data;
    }


    private boolean isEmpty(){
        return first == null;
    }

    public void displayList(){
        Node current = first;
        while (current!=null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
    }
}
