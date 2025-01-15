package ds_algo.trees.binarytree;

public class TreeContains {
    public static boolean treeIncludes(Node<String> root, String target) {
        if(root == null){
            return false;
        }
        if(root.val == target){
            return true;
        }
        return treeIncludes(root.left,target) || treeIncludes(root.right, target);
    }

    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.println(TreeContains.treeIncludes(a, "z"));
    }
}