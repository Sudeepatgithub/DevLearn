package ds_algo.trees.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");

        a.right = b;
        b.left = c;
        c.right = d;
        d.right = e;

        System.out.println(DFS.dfsIterative(a));
        System.out.println(DFS.dfsRecursive(a));
    }

    public static List<String> dfsIterative(Node<String> root) {
        if (root == null) {
            return List.of();
        }
        Stack<Node<String>> stack = new Stack<>();
        List<String> list = new ArrayList<>();
        stack.push(root);
        while (stack.size() != 0) {
            Node<String> node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return list;
    }

    public static List<String> dfsRecursive(Node<String> root) {
        if (root == null) {
            return List.of();
        }
        List<String> list = new ArrayList<>();
        list.add(root.val);
        list.addAll(dfsRecursive(root.right));
        list.addAll(dfsRecursive(root.left));
        return list;
    }
}

class Node<T> {
    T val;
    Node<T> left;
    Node<T> right;

    public Node(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}