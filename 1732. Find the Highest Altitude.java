class Solution {
    public int largestAltitude(int[] gain) {
       // Arrays.sort(gain);
        int max = 0;
        int current = 0;
        //int n = gain.length;
        for(int i = 0 ; i < gain.length; i++ ){
            current += gain[i];
            max = Math.max(current , max);
        }
        return max;
        

        
    }
}
