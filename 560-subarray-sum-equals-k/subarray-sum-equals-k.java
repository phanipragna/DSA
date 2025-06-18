class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length,c=0,sum;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                if(sum==k) c++;
            }
        }return c;
    }
}