class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int middle = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();

        for(int i = n-1 ; i >= 0 ; i--){
            if(nums[i] < middle){
                return true;
            }
            while( !stack.isEmpty() && stack.peek() < nums[i]){
                middle = stack.peek();
                stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
