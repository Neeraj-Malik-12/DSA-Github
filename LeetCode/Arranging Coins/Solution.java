class Solution {
    public int mySqrt(long x) {
        long low = 1;
        long high = x;
        long ans = -1;
        if(x==0) return 0;
        while( low <= high){
            long mid = low + (high-low)/2;
            if( mid > x/mid) high = mid-1;
            else if( mid < x/mid){
                ans = mid;
                low = mid+1;
            }
            else return (int)mid;
        }
        return (int)ans;
    }
    public int arrangeCoins(int n) {
        long m = n;
        return (mySqrt(8*m + 1) - 1)/2;
    }
}