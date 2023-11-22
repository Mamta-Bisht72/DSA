class Solution {
    List<List<Integer>> outputlist;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        outputlist=new ArrayList();
        List<Integer> subsetlist=new ArrayList();
        int ind=0;
        combinations(nums,subsetlist,ind);
        return outputlist;
        
    }
    public void combinations(int[] nums,List<Integer> subsetlist,int ind)
    {
            outputlist.add(new ArrayList(subsetlist));
        for(int i=ind;i<nums.length;i++)
        {
          if(i>ind && nums[i]==nums[i-1])
              continue;
            subsetlist.add(nums[i]);
            combinations(nums,subsetlist,i+1);
            subsetlist.remove(subsetlist.size()-1);
        }
    }
}