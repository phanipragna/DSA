class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,maxarea=0,area;
        while(l<r){
            if(height[l]<=height[r]){area=height[l]*(r-l);
                l++;}
            else{area=height[r]*(r-l);
                r--;}
            maxarea=Math.max(maxarea,area);}
        return maxarea;  
    }
}