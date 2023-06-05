package trees;
import java.util.*;

public class BinaryTreePreorderTraversal {
	
    public List<Integer> preorderTraversal(TreeNode root) {
    	
        List<Integer> preOrder = new ArrayList<>();
        Stack<TreeNode> traverse = new Stack<>();
        
        while(root!=null || !traverse.isEmpty()) {
        	while(root!=null) {
        		traverse.add(root);
        		preOrder.add(root.val);
        		root = root.left;
        	}
        	root = traverse.pop();
        	root = root.right;
        }
        return preOrder;
    }

}
