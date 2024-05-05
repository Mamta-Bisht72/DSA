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
    public int maxPathSum(TreeNode root) {
        int maxV[]=new int[1];
        maxV[0]=Integer.MIN_VALUE;
      pathsum(root,maxV);
        return maxV[0];
        
    }
    public int pathsum(TreeNode root,int maxV[])
    {
        
        if(root==null)
            return 0;
        int lsum=Math.max(0,pathsum(root.left,maxV));
        int rsum=Math.max(0,pathsum(root.right,maxV));
        maxV[0]=Math.max(maxV[0],root.val+lsum+rsum);
        return root.val+Math.max(lsum,rsum);
        
    }
}