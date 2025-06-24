class Solution {
    static int dp[]=new int[31];
    static{
        Arrays.fill(dp,-1);}
    public int fib(int n) {
        if(dp[n]!=-1) return dp[n];
        else{
            if(n<2)
                dp[n]=n;
            else
                dp[n]=fib(n-1)+fib(n-2);
        }return dp[n];
    }
}