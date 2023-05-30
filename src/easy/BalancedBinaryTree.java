package easy;

public class BalancedBinaryTree {

	
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(Math.abs(height(root.left) - height(root.right)) > 1) {
        	return false;
        }
        
        return isBalanced(root.right) && isBalanced(root.right);
    }
    
    private int height(TreeNode current) {
    	if(current == null) return 0;
    	int leftH = 1 + height(current.left);
    	int rightH = 1 + height(current.right);
    	
    	return Math.max(leftH, rightH);
    }
}
