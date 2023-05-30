package trees;

public class PathSum {

	   public boolean hasPathSum(TreeNode root, int targetSum) {
		   if(root==null) return false;
	   
		   if(root.right==null && root.left==null && root.val-targetSum==0) return true;
		   return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);  
	   }
}
