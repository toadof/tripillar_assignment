class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int a[]=new int[nums.length];
        int x=0;
        int y=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                a[x]=nums[i];
                x+=2;}
                else{        
        a[y]=nums[i];
        y+=2;}
        }
        return a;
    }
}