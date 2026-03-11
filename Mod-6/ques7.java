class ques7{
    public static void main(String[] a){
        int[] n={-1,3,-2,4,5,-6};
        int l=0,r=n.length-1;
        while(l<r){
            if(n[l]<0) l++;
            else if(n[r]>0) r--;
            else{
                int t=n[l];
                n[l]=n[r];
                n[r]=t;
            }
        }
        for(int i:n) System.out.print(i+" ");
    }
}