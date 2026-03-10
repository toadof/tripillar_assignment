class Solution {
    public int majorityElement(int[] nums) {
        int x=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                x=nums[i];
            }
            else if(nums[i]==x)count++;
            else count--;
        }
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x)
            cnt++;
        }
if(cnt>nums.length/2)
return x;
return -1;
    }
}