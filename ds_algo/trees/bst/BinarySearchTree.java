package ds_algo.trees.bst;

public class BinarySearchTree {

    private Node root;

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(4, "Sudeep");
        tree.insert(20, "Sudeep");
        tree.insert(15, "Sudeep");
        tree.insert(3, "Sudeep");
        tree.insert(39, "Sudeep");
        System.out.println(tree.find(4));
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

    private boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = false;
        if (root == null) {
            System.out.println("Empty tree");
            return false;
        }
        else {
            while (current.key != key) {
                parent = current;
                if (key <= current.key) {
                    current = current.left;
                    isLeftChild = true;
                }
                else {
                    current = current.right;
                    isLeftChild = false;
                }
                if (current == null) {
                    System.out.println("Not Found");
                    return false;
                }
            }
        }
        Node nodeToDelete = current; // found the node
        /*
        Node is leaf
         */
        if (nodeToDelete.left == null && nodeToDelete.right == null) {
            if (nodeToDelete == root) {
                root = null;
            }
            else {
                if (isLeftChild) {
                    parent.left = null;
                }
                else {
                    parent.right = null;
                }
            }
        }
        /*
        Node has one child (left or right)
         */
        //Right child
        else if (nodeToDelete.left == null) {
            if (nodeToDelete == root) {
                root = nodeToDelete.right;
            }
            else {
                if (isLeftChild) {
                    parent.left = nodeToDelete.right;
                }
                else {
                    parent.right = nodeToDelete.right;
                }
            }
        }
        //Left Child only
        else if (nodeToDelete.right == null) {
            if (nodeToDelete == root) {
                root = nodeToDelete.left;
            }
            else {
                if (isLeftChild) {
                    parent.left = nodeToDelete.left;
                }
                else {
                    parent.right = nodeToDelete.left;
                }
            }
        }
        /*
        Node has 2 children
        */
        else {
            Node successor = getSuccessor(nodeToDelete);
            if (nodeToDelete == root) {
                root = successor;
            }
            else {
                if (isLeftChild) {
                    parent.left = successor;
                }
                else {
                    parent.right = successor;
                }
            }
            successor.left = nodeToDelete.left;
            successor.right = nodeToDelete.right;
        }

        return true;
    }

    //Find min from right subtree of Node to delete
    private Node getSuccessor(Node nodeToDelete) {
        Node successor = nodeToDelete;
        Node successorParent = nodeToDelete;
        Node current = nodeToDelete.right;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        if (successor != nodeToDelete.right) {
            successorParent.left = successor.right;
        }
        return successor;
    }

    private Node find(int key) {
        Node current = root;
        if (root == null) {
            System.out.println("Empty Tree");
            return null;
        }
        else {
            while (current.key != key) {
                if (key <= current.key) {
                    current = current.left;
                }
                else {
                    current = current.right;
                }
                if (current == null) {
                    return null;
                }
            }
        }
        return current;
    }
}
