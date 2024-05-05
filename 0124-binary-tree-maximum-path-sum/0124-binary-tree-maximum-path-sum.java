/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxV;
    public int maxPathSum(TreeNode root) {
        maxV=Integer.MIN_VALUE;
      pathsum(root);
        return maxV;
        
    }
    public int pathsum(TreeNode root)
    {
        
        if(root==null)
            return 0;
        int lsum=Math.max(0,pathsum(root.left));
        int rsum=Math.max(0,pathsum(root.right));
        maxV=Math.max(maxV,root.val+lsum+rsum);
        return root.val+Math.max(lsum,rsum);
        
    }
}