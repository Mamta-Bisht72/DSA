class Solution {
    public int smallestEvenMultiple(int n) {
        int lcm=Math.max(2,n);
        if(n==1)
            return 2;
        while(true)
        {
            if(lcm%n==0 && lcm%2==0)
                return lcm;
            lcm++;
        }
        
        
    }
}