class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        recur(nums , 0 , n, output,result);
        return result;
        
    }
    private void  recur(int[] nums , int i , int n , List<Integer> output,List<List<Integer>> result){
        if(i == n){
           result.add(new ArrayList<>(output));
           return;
        }
        output.add(nums[i]);
        recur(nums , i +1 , n , output,result);
        output.remove(output.size() - 1);
        recur(nums , i+1  ,n , output ,result);
    }
}
