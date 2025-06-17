class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int csum=nums[0],maxsum=nums[0];
        for(int i=1;i<n;i++){
            if(csum<0){csum=0;}
            csum+=nums[i];
            maxsum=Math.max(maxsum,csum);//if(maxsum<=csum){maxsum=csum;}
        }return maxsum;
    }
}