class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int swap=nums[low];
                nums[low]=nums[mid];
                nums[mid]=swap;
                low++;
                mid++;
            }
            else if(nums[mid]==1)
                mid++;
            else
            {
                int swap=nums[high];
                nums[high]=nums[mid];
                nums[mid]=swap;
                high--;
            }
        }
    }
}