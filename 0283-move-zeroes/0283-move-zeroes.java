class Solution {
    public void moveZeroes(int[] nums) {
     
        int i=0;
        int j=1;
        while(i<j && j<nums.length)
        {
            if(nums[i]==0 && nums[j]!=0)
            {
                nums[i]=nums[j];
                nums[j]=0;
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]==0)
                j++;
              else
              {
                  i++;
                  j++;
              }
        }
        //  0 1 = 1 0 i=1, j=2 // 100312 // j=3// 130012 i=2 j=4
        
        
    }
}