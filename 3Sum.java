class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return new ArrayList<>();
        }
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 2 ; i++){
             int j = i+1 ;
             int k = nums.length -1;;
        while(j < k){
            int sum = nums[i] + nums[j] + nums[k];
            List<Integer> list = new ArrayList<>();
            if(sum == 0){
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                j++;
                k--;
                result.add(list);
            }
            else if(sum > 0){
                k--;
            }else{
                j++;
            }

        }
        } 
        //here first the ans is in the result but it is in the set as from line 6 and 20 but we have to answer in list so we have to convert into list by passing result into it arraylist of list
        return new ArrayList<List<Integer>>(result);
    }
}
