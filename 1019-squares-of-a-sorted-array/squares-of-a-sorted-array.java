class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[]=new int[nums.length];
        int l=0,r=nums.length-1,i=nums.length-1;//i is used for storing the resultant array
        while(l<=r){
          if(Math.abs(nums[l])>=Math.abs(nums[r])){
          res[i]=nums[l]*nums[l];  
          l++;
          }
        else{
            res[i]=nums[r]*nums[r];
            r--;
        }
        i--;
    }return res;}}