package easy;

import java.util.*;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */

//My SOl
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null || (root.left == null && root.right == null))
			return true;
		TreeNode left = root.left;
		TreeNode right = root.right;
		Stack<TreeNode> l = new Stack<TreeNode>();
		Stack<TreeNode> r = new Stack<TreeNode>();
		while ((left != null || right != null) || (!l.isEmpty() || !r.isEmpty())) {
			while (left != null || right != null) {
				if ((left != null && right == null) || (left == null && right != null)) {
					return false;
				}
				l.push(left);
				r.push(right);
				left = left.left;
				right = right.right;
			}
			left = l.pop();
			right = r.pop();
			if (left == root && right == root)
				return true;
			if ((left == root && right != root) || (left != root && right == root))
				return false;
			if (left.val != right.val) {
				return false;
			}
			left = left.right;
			right = right.left;
		}
		return true;
	}
	
	//LeetCode Sol
	 public boolean isTreeSymmetric2(TreeNode leftRoot, TreeNode rightRoot){
	        if(leftRoot == null && rightRoot == null)
	            return true;
	        if((leftRoot == null && rightRoot != null)  || (leftRoot != null && rightRoot == null))
	            return false;
	        if(leftRoot.val != rightRoot.val)
	            return false;
	        return isTreeSymmetric2(leftRoot.left, rightRoot.right) && isTreeSymmetric2(leftRoot.right, rightRoot.left);
	    }
	    public boolean isSymmetric2(TreeNode root) {
	        return isTreeSymmetric2(root.left, root.right);
	    }
}
