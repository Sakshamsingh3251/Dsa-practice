class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int spacesindex = 0;
        for(int i = 0 ; i< s.length() ; i++){
            if(spacesindex < spaces.length && i == spaces[spacesindex]){
                sb.append(' ');
                spacesindex++;
            }
            sb.append(s.charAt(i));


        }
        return sb.toString();

    }
}
