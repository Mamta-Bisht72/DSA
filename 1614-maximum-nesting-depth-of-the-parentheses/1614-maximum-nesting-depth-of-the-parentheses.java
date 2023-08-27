class Solution {
    public int maxDepth(String s) {
        int count=0;
        int mcount=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                count++;
            else if(s.charAt(i)==')')
            {
                mcount=Math.max(count,mcount);
                count--;
            }
        }
        return mcount;
    }
}