package trees;

import java.util.*;

public class BinaryTreePostorderTraversal {

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> togo = new ArrayList<>();
		if (root == null)
			return togo;
		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();
		stack1.push(root);
		while (!stack1.isEmpty()) {
			TreeNode current = stack1.pop();
			stack2.add(current);
			if (current.left != null) {
				stack1.add(current.left);
			}
			if (current.right != null) {
				stack1.add(current.right);
			}
		}
		while (!stack2.isEmpty()) {
			togo.add(stack2.pop().val);
		}
		return togo;
	}

}
