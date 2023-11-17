class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outputlist=new ArrayList();
        List<Integer> list=new ArrayList();
        int ind=0;
         listset(outputlist,list,ind,nums);
        return outputlist;
    }
    
    public static void listset(List<List<Integer>> outputlist,List<Integer>list,int ind,int[] nums)
    {
        if(ind>nums.length-1)
        {
            outputlist.add(new ArrayList<>(list));
           // System.out.print(list);
           // outputlist.add(list);
            //System.out.println(outputlist);
            return ;
        }
        list.add(nums[ind]);
        listset(outputlist,list,ind+1,nums);
        list.remove(list.size()-1);
       listset(outputlist,list,ind+1,nums);  
    }
}