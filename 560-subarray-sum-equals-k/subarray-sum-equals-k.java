class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0,n=nums.length;
        int[] res=new int[n+1];
        for(int i=1;i<=n;i++)
            res[i]=res[i-1]+nums[i-1];
        int c=0;
        for(int i=0;i<res.length;i++){
            for(int j=i+1;j<res.length;j++){
                if(res[j]-res[i]==k)
                    c++;
            }
        }return c;
    }
}