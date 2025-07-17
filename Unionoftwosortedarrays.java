import java.util.*;
class Unionoftwosortedarrays{
    public static HashSet<Integer> exe(int[] a,int[] b){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){set.add(a[i]);}
        for(int i=0;i<b.length;i++){set.add(b[i]);}
        return set;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n],b=new int[m];
        for(int i=0;i<n;i++){a[i]=sc.nextInt();}
        for (int j=0;j<m;j++){b[j]=sc.nextInt();}
        System.out.println(exe(a,b));
    }
}