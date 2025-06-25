class Solution {
    public int[] countBits(int n) {
        int res[]=new int[n+1];//,j=0,c,t;
        for(int i=0;i<=n;i++){
            res[i]=res[i/2]+(i&1); 
        /*//method to get set bit
         c=0;
         t=i;
        while(t>0){
            if((t&1)==1)//if(i%2==1) 
            c++;
            t=t>>1;//i=i/2;
        }
        res[j]=c;
        j++;*/
    }return res;
    }
}