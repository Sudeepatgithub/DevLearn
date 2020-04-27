package CrackingTheCodingInterview.LinkedLists;

class MyLinkedList {

    public Node head;

    public MyLinkedList(int data){
        head = new Node(data);
    }

    public void printOriginalList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printMyList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addData(int data){
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void addNode(Node node){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public Node getHead() {
        return head;
    }
}
