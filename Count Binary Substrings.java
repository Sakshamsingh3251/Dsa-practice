class Solution {
    public int countBinarySubstrings(String s) {
        int result = 0;
        int prevcount = 0;
        int currcount = 1;
        for(int i = 1 ; i< s.length() ; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                currcount++;

            }
            else{
                result += Math.min(prevcount , currcount);
                prevcount = currcount;
                currcount = 1;
            }
        }
        return result + Math.min(prevcount , currcount);
    }
}
