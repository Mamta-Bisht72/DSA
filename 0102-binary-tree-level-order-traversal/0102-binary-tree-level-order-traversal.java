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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<List<Integer>> levelnodes=new LinkedList<List<Integer>>();
        if(root==null)
            return levelnodes;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            List<Integer> nodes=new LinkedList<Integer>();
            int level=queue.size();
            for(int i=0;i<level;i++)
            {
                if(queue.peek().left!=null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right!=null)
                    queue.offer(queue.peek().right);
                nodes.add(queue.poll().val);
                
            }
            levelnodes.add(nodes);
        }
        return levelnodes;
    }
}