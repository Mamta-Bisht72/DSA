class Solution {
    List<List<Integer>> outputlist;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        outputlist=new ArrayList();
        List<Integer> clist=new ArrayList();
        int ind=0;
        int rem=target;
        combinations(candidates,clist,ind,target);
        return outputlist;
    }
    public void combinations(int[] candidates,List<Integer> clist,int ind,int rem)
    {
        if(rem<0)
           return;
        else if(rem==0)
        {
            outputlist.add(new ArrayList(clist));
            return;
        }
        else
        {
    for(int i=ind;i<candidates.length;i++)
    {
        if(i>ind && candidates[i]==candidates[i-1])
            continue;
        if(rem-candidates[i]<0)
            break;
        clist.add(candidates[i]);
        combinations(candidates,clist,i+1,rem-candidates[i]);
        clist.remove(clist.size()-1);      
    }
        }
    }
}