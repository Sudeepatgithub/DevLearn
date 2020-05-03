package ds_algo.trees.bst;

public class Node {
    int key;
    String value;
    Node left, right;

    Node(int key, String value){
        super();
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value='" + value + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
