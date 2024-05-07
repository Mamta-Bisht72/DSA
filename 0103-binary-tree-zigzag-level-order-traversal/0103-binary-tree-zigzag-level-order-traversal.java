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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //true for right to left
        List<List<Integer>> level=new ArrayList<List<Integer>>();
        if(root==null)
            return level;
        Queue<TreeNode> queue=new LinkedList();
        queue.add(root);
                boolean lefttoright=true;
        int size=1;
        while(!queue.isEmpty())
        {
            //System.out.println(h);
            List<Integer> rows=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode frontNode=queue.poll();
                if(lefttoright)
                    rows.add(frontNode.val);
                else
                    rows.add(0,frontNode.val);   
                if(frontNode.left!=null)
                    queue.add(frontNode.left);
                if(frontNode.right!=null)
                    queue.add(frontNode.right);
            }         
            lefttoright=!lefttoright;
            size=queue.size();
            level.add(rows);
        }
        return level;
        
        
    }
}