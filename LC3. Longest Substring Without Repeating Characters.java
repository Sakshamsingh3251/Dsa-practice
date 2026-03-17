class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        for (int i = 0; i < 256; i++) {
            hash[i] = -1;
        }
        int l = 0;
        int r = 0;
        int maxLen = 0;

        while (r < s.length()) {
            char ch = s.charAt(r);

            if (hash[ch] != -1) {
                if (hash[ch] >= l) {
                    l = hash[ch] + 1;
                }
            }
            int len = r - l + 1;
            maxLen = Math.max(len, maxLen);

            hash[ch] = r;
            r++;   
        }

        return maxLen;
    }
}
