

import java.util.*;
class Findmissingnumber{
    public static void exe(int[] a){
        HashSet <Integer> set=new HashSet<>();
        for (int i:a){
            set.add(i);
        }
        for(int i=0;i<=a.length;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){a[i]=sc.nextInt();
        }
        exe(a);
    }
}