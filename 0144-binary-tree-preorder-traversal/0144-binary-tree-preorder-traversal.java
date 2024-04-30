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
    public List<Integer> preorderTraversal(TreeNode root) {
        //root left right
        //visited once
        List<Integer> trees=new ArrayList();
        generateTrees(trees,root);
        return trees;
    }
    public void generateTrees(List<Integer> trees,TreeNode node)
    {
        if(node==null)
            return;
        trees.add(node.val);
        generateTrees(trees,node.left);
        generateTrees(trees,node.right);
        
    }
}