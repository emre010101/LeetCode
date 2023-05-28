package easy;

import java.util.*;

/**
 * Definition for a binary tree node.
 */
/*
 * class TreeNode { int val; TreeNode left; TreeNode right; TreeNode() {}
 * TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */

public class SameTree {
	//my solution
	public boolean isSameTree(TreeNode p, TreeNode q) {
		Stack<TreeNode> first = new Stack<>();
		Stack<TreeNode> second = new Stack<>();
		while ((p != null || q != null) || (!first.isEmpty() || !second.isEmpty())) {
			while (p != null || q != null) {
				if ((p != null && q == null) || (p == null && q != null))
					return false;
				first.push(p);
				second.push(q);
				p = p.left;
				q = q.left;
			}
			p = first.pop();
			q = second.pop();
			if (p.val != q.val)
				return false;
			p = p.right;
			q = q.right;
		}
		return true;
	}
	
	//my start
    public boolean isSameTree3(TreeNode p, TreeNode q) {
			if ((p != null || q == null) && (p == null ||q != null)){
				return false;}
			else if (p != null && q != null){
				if(p.val != q.val) return false;
			}
			else {
				return isSameTree3(p.left, q.left) && isSameTree3(p.right, q.right);
			}
			return true;
		}
    
    //help of ai
    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if (p == null && q == null) { // both are null, so the trees are still the same
            return true;
        } else if (p != null && q != null) { // both are not null, so we can compare their values
            if(p.val != q.val) {
                return false; // the values aren't the same, so the trees aren't the same
            } else {
                // the values are the same, so we need to check their children
                return isSameTree2(p.left, q.left) && isSameTree2(p.right, q.right);
            }
        } else { // one is null but not the other, so the trees aren't the same
            return false;
        }
    }

}