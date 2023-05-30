package trees;

import java.util.*;

/**
 * Definition for a binary tree node.*/
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
 
class BinaryTreeInorderTraversal {
	 public List<Integer> inorderTraversal(TreeNode root) {
	    	Stack<TreeNode> stack = new Stack<>();
	    	TreeNode current = root;
			List<Integer> togo = new ArrayList<>();
	        while(current != null || !stack.isEmpty()) {
	        	while(current !=null) {
	        		stack.push(current);
	        		current = current.left;
	        	}
	        	
	        	current = stack.pop();
	        	togo.add(current.val);
	        	current=current.right;
	        }
	        return togo;
	    }
}