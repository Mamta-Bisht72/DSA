class Solution {
    public String reverseWords(String s) {
        
       /* // if space at last then ignore it
        int left=s.length()-1;
        StringBuilder sb=new StringBuilder();     
        while(left>=0)
        {
            while(s.charAt(left)==' ' && left>=0)
            left--;
        if(left<0)
            break;
                  int right=left;
        while(left>=0 && s.charAt(left)!=' ')
            left--;
        if(sb.isEmpty())
            sb.append(s.substring(left+1,right+1)); 
        else
                sb.append(" "+s.substring(left+1,right+1));
                
        }
        return sb.toString();*/
        
        String [] str=s.trim().split("\\s+");
        int i=0;
        int j=str.length-1;
        while(i<j)
        {
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        
        return String.join(" ",str);
        
        
        
    }
}