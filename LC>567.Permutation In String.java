class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if(n > m) return false;

        int[] s1_freq = new int[26];
        int[] s2_freq = new int[26];//using frequency array to see how many time each element occured;

        for(int i = 0 ; i < n ; i++){
            s1_freq[s1.charAt(i) - 'a']++;
            //a = 1 ; b = 2 ....
        }
        int i = 0;
        int j = 0;
        while( j < m){
            s2_freq[s2.charAt(j) - 'a']++;

            if(j - i + 1 > n){
                s2_freq[s2.charAt(i) - 'a']--;//length is increased than s1 so remove left character;
                i++;
            }
            if(Arrays.equals(s1_freq , s2_freq)){//checking if the current window frequency meets s1's frequency
                return true;
            }
            j++;
        }
        return false;



    }
}
