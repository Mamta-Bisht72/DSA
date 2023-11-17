class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> parentheses=new ArrayList();
        String str="";
        combinations(parentheses,str,n,n);   
        return parentheses;
    }
   static void combinations(List<String>parentheses,String str,int open,int close)
    {
        if(open==0 && close==0)
        {
            parentheses.add(str);
            return;
        }
       if(open!=0)
           combinations(parentheses,str+"(",open-1,close);
       if(open<close)
           combinations(parentheses,str+")",open,close-1);
    }
}
