class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>f=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int c=target-nums[i];
            if(f.containsKey(c)){
                return new int[]{f.get(c),i};
            }
            f.put(nums[i],i);
        }
        return new int[]{};
    }
}