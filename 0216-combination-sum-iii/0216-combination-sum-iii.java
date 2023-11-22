class Solution {
    List<List<Integer>> outputlist;
    public List<List<Integer>> combinationSum3(int k, int n) {
        outputlist=new ArrayList();
        List<Integer> slist=new ArrayList();
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        int ind=0;
        csum(arr,slist,k,n,ind);
        return outputlist;
    }
    public void csum(int arr[],List<Integer> slist,int k,int n,int ind)
    {
        if(n==0 && slist.size()==k)
        {
            outputlist.add(new ArrayList(slist));
            return;
        }
        for(int i=ind;i<arr.length;i++)
        {
            
            slist.add(arr[i]);
            csum(arr,slist,k,n-arr[i],i+1);
            slist.remove(slist.size()-1);
        }
    }
}