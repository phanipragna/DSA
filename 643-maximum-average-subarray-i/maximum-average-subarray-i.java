class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double maxsum=Integer.MIN_VALUE;
        double a;
        for(int i=0;i<n-k+1;i++){
            int csum=0;
            for(int j=i;j<i+k;j++){
               csum+=nums[j];
            }
            if(maxsum<=csum){maxsum=csum;}
        }return maxsum/k;
    }
}