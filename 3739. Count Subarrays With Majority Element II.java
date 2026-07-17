class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int currentsum = 0;

        map.put(0,1);//PHLE SE PUT KAR RHE HAI CURRENT SUM == 0 , MAP ME PHLE SE HAI
        long validleftpoints  = 0;
        long result = 0;

        for(int num : nums){
            if( num == target){
                validleftpoints += map.getOrDefault(currentsum , 0);
                currentsum++;
            }else{
                currentsum--;
                validleftpoints -= map.getOrDefault(currentsum,0);
            }
            map.put(currentsum , map.getOrDefault(currentsum , 0) + 1);
            result += validleftpoints;
        }
        return result;
    }
}
