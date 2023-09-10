class Solution {
    public int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fib(n-1)+fib(n-2);
        
    }
}

// fib(4)=fib(3)+fib(2)
//fib(3)=fib(2)+fib(1)
//fib(2)=fib(1)+fib(0)