class Solution {
    static long m=1000000007;
    public int countGoodNumbers(long n) {
        long even=n/2+n%2;
        long odd=n/2;
      return (int)((pow(5,even)*pow(4,odd))%m);
                   
    }
   static long pow(long a,long p)
    {
       if(p==0)
           return 1;
        if(p%2==0)
            return (pow((a*a)%m,p/2)); 
       else 
           return (a*pow((a*a)%m,(p-1)/2))%m; 
    }
}