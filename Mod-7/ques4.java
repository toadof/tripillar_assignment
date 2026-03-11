class ques4{
    public static void main(String[] a){
        int[] n={5,1,4,2,8};
        for(int i=0;i<n.length;i++)
            for(int j=0;j<n.length-i-1;j++)
                if(n[j]>n[j+1]){
                    int t=n[j];
                    n[j]=n[j+1];
                    n[j+1]=t;
                }
        for(int x:n) System.out.print(x+" ");
    }
}
//Since it has a loop inside of a loop the time complexity is O(n^2);