class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        if(t.length() > n){
            return "";
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch , map.getOrDefault(ch,0) + 1);
        }
        int countrequired = t.length();
        int i = 0;
        int j = 0;

        int minwindowsize = Integer.MAX_VALUE;
        int  minwindowsize_start_idx = 0;

        while(j < n){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch) > 0){
                countrequired--;
            }
            map.put(ch , map.getOrDefault(ch , 0) - 1);

            while(countrequired == 0){//shrinking start (i++); jab window me required char mil gye hai countreq == 0;
                int currentwindowsize = j - i + 1;

                if(currentwindowsize < minwindowsize){
                     minwindowsize = Math.min(currentwindowsize,minwindowsize);
                     minwindowsize_start_idx = i;
                     

                }
                //now increase the freq going out of window now , taaki aage countrequired check karsake aage ane vle similar characters ke liye;
                map.put( s.charAt(i) , map.getOrDefault( s.charAt(i) , 0) + 1);

                if(map.containsKey( s.charAt(i)) && map.get( s.charAt(i)) > 0){
                    countrequired++;
                }
                i++;
               
            }
            j++;
        }
        // Check if no valid window was found
        if (minwindowsize == Integer.MAX_VALUE) {
            return "";
        } else {
            int endIndex = minwindowsize_start_idx + minwindowsize;
            return s.substring(minwindowsize_start_idx, endIndex);
       }

    }
}
//Theory and Dry run in Notes
