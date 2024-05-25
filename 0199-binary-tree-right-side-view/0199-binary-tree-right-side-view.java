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
class Pair
{
    TreeNode node;
    int row;
    public Pair(TreeNode node, int row)
    {
        this.node=node;
        this.row=row;
    }
}
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
                List<Integer> output=new ArrayList();
        if(root==null)
            return output;
        Queue<Pair> q=new LinkedList();
        q.offer(new Pair(root,0));
        TreeMap<Integer,Integer> hmap=new TreeMap<>();
        while(!q.isEmpty())
        {
            Pair current=q.poll();
            int horizontal=current.row;
            int data=current.node.val;
            hmap.put(horizontal,data);
            if(current.node.left!=null)
                q.offer(new Pair(current.node.left,horizontal+1));
            if(current.node.right!=null)
            q.offer(new Pair(current.node.right,horizontal+1));

        }
        
        //List<Integer> output=new ArrayList();
        for(Integer i:hmap.values())
            output.add(i);
        
        return output;
        
    }
}