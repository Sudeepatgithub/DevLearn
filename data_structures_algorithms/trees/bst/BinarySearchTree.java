package data_structures_algorithms.trees.bst;

public class BinarySearchTree {

    private Node root;

    private void insert(int key, String value) {
        final Node newNode = new Node(key, value);
        Node current = root;
        Node parent;
        if (current == null) {
            root = newNode;
        } else {
            while (true) {
                parent = current;
                if (key <= current.key) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
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
        while (current != null) {
            parent = current;
            current = current.left;
        }
        return parent;
    }

    private Node findMax() {
        Node current = root;
        Node parent = null;
        if (current == null) {
            return null;
        }
        while (current != null) {
            parent = current;
            current = current.right;
        }
        return parent;
    }

    private Node find(int key) {
        Node current = root;
        if (root == null) {
            return root;
        } else {
            while (current.key != key) {
                if (key <= current.key) {
                    current = current.left;
                } else {
                    current = current.right;
                }
                if (current == null) {
                    return null;
                }
            }
        }
        return current;
    }


    private boolean delete(final int key) {


        /*
        There could be 2 cases -
        - Node is leaf
        - Node has 1 child
        - Node has two children
         */

        Node current = root;
        Node parent = root;
        boolean isLeftChild = false;
        if (root == null) {
            return false;
        }
        while (current.key != key) {
            parent = current;
            if (key <= current.key) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                System.out.println("Not Found");
                return false;
            }
        }
        Node nodeToDelete = current; //found the node

        //1st case
        if (nodeToDelete.left == null && nodeToDelete.right == null) {
            if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }

        //2nd Case - Two parts
        // Node to delete is left child
        else if(nodeToDelete.right == null){
            if(nodeToDelete == root){
                root = nodeToDelete.left;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(4, "Sudeep");
        tree.insert(20, "Sudeep");
        tree.insert(15, "Sudeep");
        tree.insert(3, "Sudeep");
        tree.insert(39, "Sudeep");
        System.out.println(tree.find(4));
    }
}
