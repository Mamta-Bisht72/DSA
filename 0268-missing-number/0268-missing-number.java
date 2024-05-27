class Solution {
    public int missingNumber(int[] nums) {
        /*int miss=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=miss)
                return miss;
            else 
                miss++; 
        }
        return miss;*/
        int sum=0;
        int n=nums.length;
        int tsum=(n*(n+1))/2;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        return tsum-sum;
    }
}