class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        //int[] count = new int[n];
        int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0 ;
        // int right = 0;

        for(int right = 0 ; right < n ; right++ ){
            char ch = s.charAt(right);
         map.put(ch, map.getOrDefault(ch, 0) + 1);
        
        while(map.containsKey('a') && map.containsKey('b') && map.containsKey('c')){
            ans += n - right;
            char leftChar = s.charAt(left);
           map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

            left++;
        }



        

    }
        return ans;
}
}
    
