package ds_algo.trees.bst;

public class BST2 {

    private static final int COUNT = 5;
    private Node root;

    public static void main(String[] args) {
        BST2 tree = new BST2();
        tree.insert(4, "4");
        tree.insert(20, "20");
        tree.insert(15, "15");
        tree.insert(3, "3");
        tree.insert(39, "39");
        tree.print2D();
    }

    private void insert(int key, String value) {
        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent = root;
            boolean isLeftChild = false;
            while (current != null) {
                parent = current;
                if (key <= current.key) {
                    current = current.left;
                    isLeftChild = true;
                } else {
                    current = current.right;
                    isLeftChild = false;
                }
            }
            if (isLeftChild) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        }

    }

    private boolean delete(int key) {
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current.key != key) {
            parent = current;
            if (key <= current.key) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
        }
        Node nodeToDelete = current;
        /*
        leaf
        1 child
        2 children
         */
        if (nodeToDelete.left == null && nodeToDelete.right == null) {
            if (nodeToDelete == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        }
        //1 left child
        else if (nodeToDelete.right == null) {
            if (nodeToDelete == root) {
                root = nodeToDelete.left;
            } else {
                if (isLeftChild) {
                    parent.left = nodeToDelete.left;
                } else {
                    parent.right = nodeToDelete.right;
                }
            }
        } else if (nodeToDelete.left == null) {
            if (nodeToDelete == root) {
                root = nodeToDelete.right;
            } else {
                if (isLeftChild) {
                    parent.left = nodeToDelete.right;
                } else {
                    parent.right = nodeToDelete.right;
                }
            }
        } else {
            Node successor = getSuccessor(nodeToDelete);
            if (nodeToDelete == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
            successor.left = nodeToDelete.left;
            successor.right = nodeToDelete.right;
        }
        return false;
    }

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

    private void print2DUtil(Node root, int space) {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.value + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }

    // Wrapper over print2DUtil()
    private void print2D() {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }
}
