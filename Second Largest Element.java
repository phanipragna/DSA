class SecondLargestElement{
public static void main(String[] args){
int[] x={1,4,8,3,0,9,7};
int l=x[0];
int sl=x[0];
if(x.length<2){System.out.println(-1);}
for(int i=0;i<x.length;i++){
if(x[i]>l){
sl=l;l=x[i];}
}
System.out.println("second largest element : "+sl);
}
}
