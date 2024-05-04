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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        List<List<Integer>> nodes=new LinkedList<List<Integer>>();
        if(root==null)
            return 0;
        q.offer(root);
        
        while(!q.isEmpty())
        {
            List<Integer> level=new LinkedList<Integer>();
            int length=q.size();
            for(int i=0;i<length;i++)
            {
                if(q.peek().left!=null)
                    q.offer(q.peek().left);
                if(q.peek().right!=null)
                    q.offer(q.peek().right);
                level.add(q.poll().val);
            }
            nodes.add(level);
                
        }
        return nodes.size();
        
        
       /* if(root==null)
            return 0;
        TreeNode l=root;
        TreeNode r=root;
        int height=1;
        while(l!=null && r!=null)
        {
            if(l.left==null && r.right==null)
                return height;
                height++;
                l=l.left;
                r=r.right;
        }
        return height; */
    }
}