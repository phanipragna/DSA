class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=Integer.toString(num);
        int c=0;
        for(int i=0;i<s.length()-k+1;i++){
            String sb=s.substring(i,i+k);
            int n=Integer.valueOf(sb);
            if(n!=0 && num%n==0) c++;
        }return c;
    }
}