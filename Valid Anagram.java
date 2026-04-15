class Solution {
    public boolean isAnagram(String s, String t) {
        //if the length is different then not a anagram
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        //counting the character of string s and putting there frequency in the map
        for(int i = 0; i<s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }
        //now traversing string t and matching the count with s and reducing the count of s using t
        for(int i = 0; i < t.length() ; i++){
            char ch = t.charAt(i);
            //base statement if character not present in map then not a anagram
            if(!map.containsKey(ch)){
                return false;
            }
            //cancelling the occurance of that char as it is once appeared in the stack
            map.put(ch , map.get(ch) - 1);
            
            //if count of a character becomes zero then remove the character
            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }
        //if the map is empty that means we have now obtained anagram 
        return map.isEmpty();

    }
}
