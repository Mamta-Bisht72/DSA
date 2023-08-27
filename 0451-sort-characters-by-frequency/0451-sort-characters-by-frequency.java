class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hmap=new HashMap(); 
        for(int i=0;i<s.length();i++)
        {
            if(hmap.containsKey(s.charAt(i)))
                hmap.put(s.charAt(i),hmap.get(s.charAt(i))+1);
            else
                hmap.put(s.charAt(i),1);
        }
        List<Character> keyset=new ArrayList(hmap.keySet());
        Collections.sort(keyset,(a,b)->(hmap.get(b)-hmap.get(a)));
        StringBuilder sb=new StringBuilder();
        for(Character c: keyset)
        {
            for(int i=0;i<hmap.get(c);i++)
                sb.append(c);
        }
        return sb.toString();
    }
}