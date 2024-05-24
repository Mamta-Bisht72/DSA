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

class Distance{
    TreeNode node;
    int row;
    int col;
    public Distance(TreeNode node,int row,int col)
    {
        this.node=node;
        this.col=col;
        this.row=row;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
      
        Queue<Distance> q=new LinkedList<Distance>(); 
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        q.add(new Distance(root,0,0));
        while(!q.isEmpty())
        {
            Distance dis=q.poll();
            TreeNode node=dis.node;
            int vertical=dis.row;
            int level=dis.col;
            
            if(!map.containsKey(vertical))
                map.put(vertical,new TreeMap<>());
            if(!map.get(vertical).containsKey(level))
                map.get(vertical).put(level,new PriorityQueue<>());
            map.get(vertical).get(level).offer(node.val);
            if(node.left!=null)
            q.offer(new Distance(node.left,vertical-1,level+1));
            if(node.right!=null)
                q.offer(new Distance(node.right,vertical+1,level+1));
            
        }
        
        List<List<Integer>> output=new ArrayList();
        for(TreeMap<Integer,PriorityQueue<Integer>> nl : map.values())
        {
            output.add(new ArrayList());
            for(PriorityQueue<Integer> pq: nl.values())
            {
                while(!pq.isEmpty())
                {
                    //System.out.println(q.peek());
                    output.get(output.size()-1).add(pq.poll());
                }
            }
        }
        return output;
        
        
        
        
        
    }
}