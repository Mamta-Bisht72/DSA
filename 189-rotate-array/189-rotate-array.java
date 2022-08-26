class Solution {
    public void rotate(int[] nums, int k) {
      int n=nums.length;
        k=k%n;
        if(n>1)
        {
       reverse(nums,0,n-k-1);
       reverse(nums,n-k,n-1);
       reverse(nums,0,n-1);
        }
    }
        //2345671//3456712
 void reverse(int[]nums,int l,int r)
 {
     while(l<r)
     {
         int temp=nums[r];
         nums[r]=nums[l];
         nums[l]=temp;
         l++;
         r--;
     }
     

 }
}
