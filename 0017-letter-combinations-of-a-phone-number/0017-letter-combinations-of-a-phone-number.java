class Solution {
    Map<Character,String> hmap;
    List<String> output;
    public List<String> letterCombinations(String digits) {
        hmap=new HashMap();
        output=new ArrayList();
        if(digits.length()==0)
            return output;
        hmap.put('2', "abc");
        hmap.put('3', "def");
        hmap.put('4', "ghi");
        hmap.put('5', "jkl");
        hmap.put('6', "mno");
        hmap.put('7', "pqrs");
        hmap.put('8', "tuv");
        hmap.put('9', "wxyz");  
        StringBuilder str=new StringBuilder();
        backtrack(0,str,digits);
        return output;
    }
    
   public void backtrack(int ind,StringBuilder str,String digits)
    {
        if(ind>=digits.length())
        {
            output.add(str.toString());
            return;
        }
        
        String curr=hmap.get(digits.charAt(ind));
        for(int j=0;j<curr.length();j++)
        {
            str.append(curr.charAt(j));
            backtrack(ind+1,str,digits);
            str.deleteCharAt(str.length()-1);
        }
    }
}