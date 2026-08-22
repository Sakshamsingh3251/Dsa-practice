class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return 0;
        }
        HashMap<Integer , Integer> map = new HashMap<>();
        int currsum = 0;
        int maxlength = 0;

        map.put(0 , -1);//length ko correctly calculate karne ke liye (1 - (-1) = 2);
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 1){
                currsum += 1;
            }
            else{
                currsum -= 1;//treating 0 as -1 (ek 1 aya aur ek 0 aya to overall (1-1 = 0) , that is agar sum =  0 , then equal number of ones and zeroes , something like bohr voting algo(find missing element types));
            }
            if(map.containsKey(currsum)){//if currsum = 0 then equal no of 1's and 0's
                maxlength = Math.max(maxlength , i - map.get(currsum));
            }else{
                map.put(currsum , i);
            }
        }
        return maxlength;
        
    }
}
