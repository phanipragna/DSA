public class Solution{
    public boolean isMonotonic(int[] nums){
        int n=nums.length;
        if(n<2){return true;}
        int order=0;
        if(nums[0]<nums[1]){order=1;}
        else if(nums[0]<nums[1]){order=2;}
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                if(order==0){order=1;}
                else if(order==2){return false;}
            }
        else if (nums[i]>nums[i+1]){
            if(order==0){order=2;}
            else if(order==1){return false;}
        }}return true;
    }
    public static void main(String[] args){
        Solution obj=new Solution();
        int[] nums1={1,2,2,3};
        int[] nums2={6,5,4,4};
        int[] nums3={1,3,2};
        System.out.println(obj.isMonotonic(nums1));
        System.out.println(obj.isMonotonic(nums2));
        System.out.println(obj.isMonotonic(nums3));
    }
}