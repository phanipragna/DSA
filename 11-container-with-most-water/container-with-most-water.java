class Solution {
    public int maxArea(int[] height) {
        int left=0,maxarea=0,min;
        int right=height.length-1;
        while(left<right){
            if(height[left]<=height[right]) 
                min=height[left];
            else min=height[right];
            int area=min*(right-left);
            maxarea=Math.max(maxarea,area);
            if(height[left]<height[right]) left++;
            else right--;
        }return maxarea;
    }
}