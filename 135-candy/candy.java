class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int res[]=new int[n];
        Arrays.fill(res,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1])
                res[i]=res[i-1]+1;
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1] && res[i]<=res[i+1])
                res[i]=res[i+1]+1;
        }
        int s=0;
        for(int i:res)
            s=s+i;
        return s;
        }
}