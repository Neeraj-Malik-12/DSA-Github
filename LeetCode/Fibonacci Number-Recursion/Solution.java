class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }
}

// A better TC approach :

class Solution {
    public int fib(int n) {
        if( n == 0) return 0;

        int t1 = 0;
        int t2 = 1;
        for( int i = 1; i < n ;i++){
            int sum = t2;
            t2 += t1;
            t1 = sum;
        }
        return t2;
    }
}