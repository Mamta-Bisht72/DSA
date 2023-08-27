class Solution {
    public String removeOuterParentheses(String s) {
       /*
       (()(()))
       
       */
        String str="";
        int opened=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                if(opened>0)
                    str+='(';
                  //s.append(s.charAt(i));
            opened++;

            }
            else
            {
                if(opened>1)
                    str+=')';
               // s.append(')');
                opened--;
            }
        }
        return str;
    }
}