class Solution {
    public int missingNumber(int[] nums) {
        int miss=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=miss)
                return miss;
            else 
                miss++; 
        }
        return miss;
    }
}