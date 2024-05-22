class Solution {
    public int countPrimes(int n) {
        if(n<2)
            return 0;
        
      boolean sieve[]=new boolean[n+1];
        Arrays.fill(sieve,true);
        sieve[0]=false;
        sieve[1]=false;
        
        for(int i=2;i*i<=n;i++)
        {
            if(sieve[i]==true)
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    sieve[j]=false;
                }
            }
        }
        
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(sieve[i]==true)
                count++;
        }
        return count;
    }
}