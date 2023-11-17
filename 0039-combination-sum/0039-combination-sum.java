class Solution {
    List<List<Integer>> outputlist;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        outputlist=new ArrayList();
        List<Integer> sumlist=new ArrayList();
        int ind=0;
        int sum=0;
        sumset(sumlist,candidates,target,ind,sum);
        return outputlist;
        
    }
    public void sumset(List<Integer>sumlist,int[] candidates, int target,int ind,int sum)
    {
        if(ind>candidates.length-1 || sum>target)
            return;
        if(sum==target)
        {
            outputlist.add(new ArrayList<Integer>(sumlist));
            return;
        }
        sum+=candidates[ind];
        sumlist.add(candidates[ind]);
        sumset(sumlist,candidates,target,ind,sum);
        sumlist.remove(sumlist.size()-1);
        sum-=candidates[ind];
        sumset(sumlist,candidates,target,ind+1,sum);    
        
    }
}