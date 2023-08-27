class Solution {
    public int romanToInt(String s) { 
       // 27=20+7
    // 9
        HashMap<Character,Integer> rmap=new HashMap();
        rmap.put('I',1);
        rmap.put('V',5);
        rmap.put('X',10);
        rmap.put('L',50);
        rmap.put('C',100);
        rmap.put('D',500);
        rmap.put('M',1000);
        int result=rmap.get(s.charAt(s.length()-1));
        for(int i=s.length()-1;i>0;i--)
        {
            char c=s.charAt(i);
            if(rmap.get(s.charAt(i-1))<rmap.get(s.charAt(i)))
                result=result-rmap.get(s.charAt(i-1));
            else
                result=result+rmap.get(s.charAt(i-1));
        }
        return result;

    }
}