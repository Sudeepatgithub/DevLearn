package DataStructuresAndAlgorithms.BinarySearchTree;

public class Main {

    public static void main(String[] args) {
        BST binaryTree = new BST();
        binaryTree.insert(10,"One");
        binaryTree.insert(6,"One");
        binaryTree.insert(2,"One");
        binaryTree.insert(22,"One");
        binaryTree.insert(20,"One");
        binaryTree.displayTree();
        binaryTree.deleteNode(2);
        binaryTree.displayTree();
    }
}
