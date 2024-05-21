class Solution {
    public int addDigits(int num) {
        
       int sum=num;
        while(sum>9)
        {
            int dig=num%10;
            num=num/10;
            sum=dig+num;
            if(sum>9)
                num=sum;
            
        }
        return sum;
    }
    
}