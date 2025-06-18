class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,max=0,i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                max=Math.max(max,c);
                c=0;
            }
            else c++;
        }
        if(nums[i-1]==1){
            max=Math.max(max,c);
        }return max;
    }
}