class Solution {
     static int dp[]=new int[38];
        static{
            Arrays.fill(dp,-1);
        }
    public int tribonacci(int n) {
        if(dp[n]!=-1) return dp[n];
        else{
            if(n<2) dp[n]=n;
            else if(n==2) dp[n]=1;
            else
            dp[n]=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        }return dp[n];
    }
}