package DsAlgo.trees.bst;

public class BinarySearchTree {

    private Node root;

    private BinarySearchTree() {

    }

    private void insert(int key, String value) {
        final Node newNode = new Node(key, value);
        Node current = root;
        Node parent;
        if (current == null) {
            root = newNode;
        }
        else {
            while (true) {
                parent = current;
                if (key <= current.key) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    private Node findMin() {
        Node current = root;
        Node parent = root;
        if (current == null) {
            return null;
        }
        while (current!=null) {
            parent =current;
            current = current.left;
        }
        return parent;
    }

    private Node findMax(){
        Node current = root;
        Node parent = null;
        if(current == null){
            return null;
        }
        while (current!=null){
            parent = current;
            current = current.right;
        }
        return parent;
    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(40,"Sudeep");
        tree.insert(20,"Sudeep");
        tree.insert(15,"Sudeep");
        tree.insert(3,"Sudeep");
        tree.insert(39,"Sudeep");
        System.out.println(tree.findMax());
        System.out.println(tree.findMin());
    }
}
