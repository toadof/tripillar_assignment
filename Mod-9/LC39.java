//LeetCode 39 – Combination Sum (Medium)
class Solution {
    public void rec(List<List<Integer>> res,int[] candidates,int target,List<Integer> cur,int start){
        int n=candidates.length;
        if(target==0){res.add(new ArrayList<>(cur));return;
    }
    if(target<0){return;}
    for(int i=start;i<n;i++){
        {cur.add(candidates[i]);
        
        rec(res,candidates,target-candidates[i],cur,i);
         cur.remove(cur.size()-1);
        }

    }}
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> res = new ArrayList<>();

    int sum=0;
    rec(res,candidates,target,new ArrayList<>(),0);
    return res;

    }
}