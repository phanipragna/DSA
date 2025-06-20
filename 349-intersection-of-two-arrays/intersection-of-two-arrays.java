class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs=new HashSet();
        List<Integer> res=new ArrayList<>();
        for(int i:nums1)
        hs.add(i);
        for(int i:nums2){
            if(hs.contains(i)){
                res.add(i);
                hs.remove(i);
            }
        }
        int ar[]=new int[res.size()];
        int i=0;
        for(int j:res){ ar[i++]=j;}
        return ar;
    }
}