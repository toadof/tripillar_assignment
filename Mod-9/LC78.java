//LeetCode 78 – Subsets (Medium)
class Solution {
    static void subset(int[] arr,int index,List<Integer> current,List<List<Integer>> list){
		if(index==arr.length){
        list.add(new ArrayList<>(current));return;}
		current.add(arr[index]);
		subset(arr,index+1,current,list);
		current.remove(current.size()-1);
		subset(arr,index+1,current,list);
	}
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
          subset(nums,0,new ArrayList<>(),list);
        return list;
    }
}
