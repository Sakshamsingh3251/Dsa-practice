class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int maximumfreq = 0;
        int ans = 0;
        
        for(int right = 0 ; right < s.length() ; right++){
            char ch = s.charAt(right);
            map.put(ch , map.getOrDefault(ch , 0) + 1);

            maximumfreq = Math.max(maximumfreq , map.get(ch));

            int changes = (right - left + 1) - maximumfreq;

            if(changes > k){
                char cha = s.charAt(left);
                map.put(cha , map.getOrDefault(cha , 0) - 1);
                left++;
            }
            ans = Math.max(ans , right - left + 1);
        }
        return ans;
    }
}
