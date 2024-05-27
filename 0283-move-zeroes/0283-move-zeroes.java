class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(i<j && j<nums.length)
        {
            if(nums[i]==0 && nums[j]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
                // 1 1 0 3 12 
            }
            else if(nums[i]!=0)
            {
                i++;
                j++;
            }
          else
                j++;
                
        }
    }
}