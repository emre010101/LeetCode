package trees;
import java.util.*;
public class MinumumDepthofBinaryTree {

	public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 1;
        while(!queue.isEmpty()) {
        	int levelSize = queue.size();
        	for(int i=0; i<levelSize; i++) {
        		TreeNode current = queue.poll();
        		if(current.right==null && current.left==null) {
        			return depth;
        		}
        		if(current.left!=null) {
        			queue.add(current.left);
        		}
        		if(current.right!=null) {
        			queue.add(current.right);
        		}
        	}
        	depth++;
        }
        return depth;
	}
        
}
