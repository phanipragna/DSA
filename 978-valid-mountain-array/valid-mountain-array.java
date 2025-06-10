public class Solution{
    public boolean validMountainArray(int[] arr){
        int i=0;
        int n=arr.length;
        while(i<n-1 && arr[i]< arr[i+1]){
            i++;}
        if(i == 0 || i == n-1) {
            return false;
            }
        while(i<n-1 && arr[i]>arr[i+1]){i++;}
        return i==n-1;
    }
    public static void main(String[] args){
        Solution obj = new Solution();
            int[] arr1 = {0,2,3,5,3,1};
            int[] arr2 = {2,4,3,8};
            System.out.println(obj.validMountainArray(arr1));
            System.out.println(obj.validMountainArray(arr2));
    }
}