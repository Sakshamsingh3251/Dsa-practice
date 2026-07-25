class Solution {
    public int minimumLength(String s) {
        //trick to solve :-
        //jab ham map me alphabets ki frequency store kar lenge aur jiski frequency left + current index + right milakar odd numbers aye mtlb vo character ko ham left aur closest right se utne same alpha delete kar skte hai
        // ex :- "abaacbcbb"
        //now a :- 3  odd hai to 3-1 = 2 (2 a's delete honge);
        //b :- 4  even hai to 4 -2 = 2 (2 b's delete honge);
        //c :- 2 even hai to 2-2 = 0 …ashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }
        int remove = 0;
        for(char ch : map.keySet()){
            int freq = map.get(ch);
            if(freq % 2 == 0){
                remove += freq - 2;
            }else{
                remove += freq - 1 ;

            }
            
        }
        return s.length() - remove;

    }
}
