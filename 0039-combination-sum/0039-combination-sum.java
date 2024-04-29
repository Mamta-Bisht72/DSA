class Solution {
            List<List<Integer>> unique=new ArrayList();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> subset=new ArrayList();
        generateSubset(0,candidates,target,subset,0);
        return unique;
        
        
    }
    
   public void generateSubset(int ind,int[] candidates,int target,List<Integer> subset,int sum)
    {
        if(ind>candidates.length-1 || sum>target)
            return;
        if(sum==target)
        {
            unique.add(new ArrayList<Integer>(subset));
            return;
        }
        subset.add(candidates[ind]);
        sum=sum+candidates[ind];
        generateSubset(ind,candidates,target,subset,sum);
        subset.remove(subset.size()-1);
        sum-=candidates[ind];
        generateSubset(ind+1,candidates,target,subset,sum);
        
        
        
    }

}