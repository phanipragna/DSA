class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length,csum=0;
        for(int i=0;i<k;i++){ csum+=nums[i];}
        int maxsum=csum;
        for(int i=1;i<n-k+1;i++){
            csum=csum-nums[i-1]+nums[i+k-1];
            maxsum = Math.max(maxsum, csum);
        }return (double)maxsum/k;
    }
}