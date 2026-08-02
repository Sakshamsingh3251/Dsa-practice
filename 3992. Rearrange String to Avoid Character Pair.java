class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder ans = new StringBuilder();
        int xcount = 0;
        int ycount = 0;

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == x){
                xcount++;
            }
            else if( ch == y){
                ycount++;
            }
            else{
                ans.append(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i< ycount ; i++){
            result.append(y);
        }
        result.append(ans);
        for(int i = 0 ; i<xcount ; i++){
            result.append(x);
        }
        return result.toString();
    }
}
