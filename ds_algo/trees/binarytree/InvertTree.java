package ds_algo.trees.binarytree;

import java.util.Stack;

public class InvertTree {
    public TreeNode invertTreeStack(TreeNode root) {
        if(root==null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(stack.size()!=0){
            TreeNode node = stack.pop();
            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }
            TreeNode left = node.left;
            TreeNode right = node.right;
            TreeNode temp = left;
            node.left = right;
            node.right = temp;
        }
        return root;
    }

}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

