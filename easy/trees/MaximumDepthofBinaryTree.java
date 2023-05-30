package trees;
import java.util.*;

public class MaximumDepthofBinaryTree {
	
    public int maxDepth(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}else {
    		int leftD = maxDepth(root.left);
    		int righD = maxDepth(root.right);
    		return Math.max(leftD, righD)+1;
    	}
    }

}
