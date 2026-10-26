class Solution {
    public int countMagicalPairs(String s) {
        int n = s.length();
        int ans = 0;
        for(int j = 0;j<n-1;j++){
            int[] left = new int[27];
            int[] right = new int[27];

            HashSet<Character> set = new HashSet<>();

            for(int i = j;i>=0;i--){
                set.add(s.charAt(i));
                left[set.size()]++;
                
            }
            set.clear();
            for(int k = j+1;k<n;k++){
                set.add(s.charAt(k));
                right[set.size()]++;
            }

            for(int l = 1;l<=26;l++){
                ans += (long) left[l] * right[l];
            }
        }
        return (int)ans;
    }
}
