class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //[-1,0,1,2,-1,-4]
        // i!=j ,i!=k, j!=k
        // 
        Set<List<Integer>> set=new HashSet();
        Set<Integer> hset;
        int n=nums.length;
        
        for(int i=0;i<n;i++)
        {
            hset=new HashSet();    
            for(int j=i+1;j<n;j++)
            {
             int sum=nums[i]+nums[j];
            if(hset.contains(-sum))
            {
                List<Integer> list=new ArrayList();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(-sum);
                Collections.sort(list);
                set.add(list);
            }
                hset.add(nums[j]);
                
            }
        }
       List<List<Integer>> tsum=new ArrayList();
        tsum.addAll(set);
        return tsum;
        
    }
}