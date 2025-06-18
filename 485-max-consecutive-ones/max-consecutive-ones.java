class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxsum=0, csum=0;
        int n=nums.length;
        for (int i=0;i<n;i++){

            if(nums[i]==1){
                csum++;
                maxsum=Math.max(maxsum,csum);
            }
            else csum=0;
            
        }return maxsum;
    }
}