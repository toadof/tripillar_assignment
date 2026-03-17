//LeetCode 46 – Permutations (Medium)
class Solution {
    public void elements(int[] arr,List<Integer> cur,List<List<Integer>> res,boolean[] used){
        int n=arr.length;
        if(cur.size()==n){res.add(new ArrayList<>(cur));return;}
        for(int i=0;i<n;i++){
            if(!used[i]){
                cur.add(arr[i]);
                used[i]=true;
                elements(arr,cur,res,used);
                cur.remove(cur.size()-1);
                used[i]=false;
            }
        }

   
    }
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
    boolean[] used = new boolean[nums.length];
    elements(nums, new ArrayList<>(), res, used);
    return res;

    }
}