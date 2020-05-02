package geeks4geeks.linkedlist;

class SinglyList {

    private Node head;

    public SinglyList(int data){
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
        if (temp==null){
            System.out.println("Empty List");
        }
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

    Node deleteNode(int value){
        Node temp = head;
        if(temp==null){
            return null;
        }
        if(temp.data==value){
            return temp.next;
        }
        Node prev = temp;
        Node cur = temp.next;
        boolean flag =false;
        while (cur!=null){
            if(cur.data == value){
                prev.next = cur.next;
                flag =true;
            }
            prev=prev.next;
            cur=cur.next;
        }
        if(!flag){
            System.out.println("Not Found");
        }
        return head;
    }

    public Node getHead() {
        return head;
    }
}
