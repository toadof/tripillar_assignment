class ques5{
    public static void main(String[] a){
        int[] n={64,25,12,22,11};
        for(int i=0;i<n.length;i++){
            int m=i;
            for(int j=i+1;j<n.length;j++)
                if(n[j]<n[m]) m=j;
            int t=n[m];
            n[m]=n[i];
            n[i]=t;
        }
        for(int i=0;i<n.length;i++)
        	System.out.print(n[i]+" ");
    }
}