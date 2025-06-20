class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }int c=0;
        for(Map.Entry<Integer,Integer>  rs : hm.entrySet()){
            if(rs.getValue()==1)
    	    c=rs.getKey();
        }return c;
    }
}