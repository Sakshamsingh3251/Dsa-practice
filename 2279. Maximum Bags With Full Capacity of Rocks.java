class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int count = 0;
        int[] required = new int[n];
        for(int i = 0 ; i < n ; i++){

        required[i] = capacity[i] - rocks[i];
        
        }
        Arrays.sort(required);
        for(int i = 0 ; i < n ; i++){
            if(additionalRocks >= required[i] ){
                additionalRocks = additionalRocks - required[i];
                count++;
            }else{
                break;
            }
        }
        return count;






        
    }
}
