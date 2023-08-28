class Solution {
    public void rotate(int[] nums, int k) {
    //4321765
    /*reverse: 0,n-k-1//0,3//4321
      n-k,n-1//4,6//765
    0,n-1 43217658 */ 
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    
    }
    
    void reverse(int arr[],int beg,int end)
    {
        int i=beg;
        int j=end;
        while(i<j) //0<3 1<3
        {
            int temp=arr[i];//1//2
            arr[i]=arr[j];//4//
            arr[j]=temp;//1
            i++;
            j--;//4231
        }
    }
}