class Solution {
    public int firstMatchingIndex(String s) {
        int n = s.length();
        int i = 0;
        int j = n - i - 1;
        while( i <= j){
            if (s.charAt(i) == s.charAt(j)) {
            return i;
        } else {
            i++;
            j--;

        }
        if(i == j){
            return i ;
        }
        

        }
        return -1;
        

    }

}
