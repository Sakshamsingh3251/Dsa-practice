class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int  n = nums.length;
        
         Stack<Integer> stack = new Stack<>();

         int[] result = new int[n];
         for(int i = 0 ; i< result.length ; i++){
            result[i] = -1;
         }

        for(int i = 1 ; i < n ; i++){
            while(true){
                if(stack.isEmpty()){
                    stack.push(i);
                    break;
                }
                int index = stack.peek(… i = 0 ; i < nums.length ; i++){
            while(true){
                if(stack.isEmpty()){
                    stack.push(i);
                    break;
                }
                int index = stack.peek();
                if(nums[i] > nums[index]){
                    result[index ]  = nums[i];
                    stack.pop();

                }else{
                    stack.push(i);
                    break;
                }

            }
        }
         return result;
    }
}
