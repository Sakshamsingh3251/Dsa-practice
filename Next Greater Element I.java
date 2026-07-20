class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer , Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1 ; i < nums2.length ; i++){
            while( true){
                if(stack.isEmpty()){
                  stack.push(i);
                  break;
                    //agar stack empty ho jaye tab jab 1 -> 3 map me store ho jaye
                    //tab stack se i pop ho jata hai aur naye i ke liye....
                }
              int index = stack.peek();
              if(nums2[i] > nums2[index]){
                
                    map.put(nums2[index] , nums2[i]);
                    stack.pop();
                }else{
                    stack.push(i);
                    break;
                }
            }
        }
        //map<{1:3 , 3: 4} exmaple 
        int[] result = new int[nums1.length];

        for(int i = 0 ; i < result.length ; i++){
            if(map.containsKey(nums1[i])){
                result[i] = map.get(nums1[i]);
            }else{
                result[i] = -1;
            }
        }
        return result;
    }
}
