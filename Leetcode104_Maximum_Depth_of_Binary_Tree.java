
public class Leetcode104_Maximum_Depth_of_Binary_Tree {
	  public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		  }
	
	public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }else{
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return Math.max(left_height,right_height)+1;
        }
    }
}
