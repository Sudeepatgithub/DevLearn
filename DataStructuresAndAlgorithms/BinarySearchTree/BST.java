package DataStructuresAndAlgorithms.BinarySearchTree;

import java.util.Stack;

public class BST {

    private Node root;

    public BST() {

    }

    public void insert(int key, String value) {

        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key < current.key) {
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

    public Node findMinimum() {
        Node current = root;
        Node last = null;
        while (current != null) {
            last = current;
            current = current.left;
        }
        return last;
    }

    public Node findMax() {
        Node current = root;
        Node last = null;
        while (current != null) {
            last = current;
            current = current.right;
        }
        return last;
    }

    public boolean deleteNode(int key) {


        //If the node has one child

        //If the node has two children
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;


        while (current.key != key) {
            parent = current;
            if (key < current.key) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
            if (current == null) {
                return false;       //Not Found
            }
        }
        Node nodeToDelete = current;

        //If the node is leaf
        if (nodeToDelete.left == null && nodeToDelete.right == null) {
            if (nodeToDelete == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        //Node has a right child
        else if (nodeToDelete.left == null) {
            if (nodeToDelete == root) {
                root = nodeToDelete.right;
            } else if (isLeftChild) {
                parent.left = nodeToDelete.right;
            } else {
                parent.right = nodeToDelete.right;
            }
        }

        //Node has a left child

        else if(nodeToDelete.right == null){
            if(nodeToDelete == root){
                root = nodeToDelete.left;
            }
            else if(isLeftChild){
                parent.left = nodeToDelete.left;
            }else {
                parent.right = nodeToDelete.left;
            }
        }
        //If Node has two children

        else {
            Node successor = getSuccessor(nodeToDelete);
            if (nodeToDelete == root) {
                root = successor;
            }else if(isLeftChild){
                parent.left = successor;
            }else {
                parent.right = successor;
            }
            successor.left = nodeToDelete.left;
        }
        return true;
    }

    private Node getSuccessor(Node nodeToDelete) {

        Node successor = nodeToDelete;
        Node successorParent = nodeToDelete;

        Node current = nodeToDelete.right;      //Goto Right

        while (current!=null){      //Go left down the tree, unitil there is no left child
            successorParent  = successor;
            successor = current;
            current = current.left;
        }
        if(successor!=nodeToDelete.right){      //If the successor is not a right child
            successorParent.left = successor.right;
            successor.right = nodeToDelete.right;
        }
        return successor;
    }

    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("......................................................");

        while(isRowEmpty==false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for(int j=0; j<nBlanks; j++) {
                System.out.print(" ");
            }

            while(globalStack.isEmpty()==false) {
                Node temp = (Node)globalStack.pop();
                if(temp != null) {
                    System.out.print(temp.key);
                    localStack.push(temp.left);
                    localStack.push(temp.right);
                    if(temp.left != null || temp.right != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }

                for(int j=0; j<nBlanks*2-2; j++) {
                    System.out.print(" ");
                }
            }

            System.out.println();
            nBlanks = nBlanks/2;

            while(localStack.isEmpty()==false)
                globalStack.push( localStack.pop() );
        }
        System.out.println( "......................................................");

    }
}
