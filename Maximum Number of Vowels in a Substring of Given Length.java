class Solution {
    public boolean isVowel( char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u';
    }
    public int maxVowels(String s, int k) {
     // 1. i = 0, j = 0, == for two ends of our sliding window
     // 2. counting karte raho agar S[j] hai a ya e ,i,o,u.
     //3. jab ham k size ke window pe pahuch jayenge (j-i+1 == k) tab:-
     // 3.1 update karo maxVowel ko
     //3.2 shift karo right side of window (i++) sath hi sath vowels ke window ko bhi kam karo phiche se agar s[i] ek vowl hai to , aur phir uska count ko adjust karo.  

     int n = s.length();
     int i = 0 , j = 0;
     int maxvowel = 0;
     int count = 0;

     while(j < n){
        if(isVowel(s.charAt(j))){
            count++;
        }
        if(j - i +1 == k){
            maxvowel = Math.max(maxvowel , count);
            if(isVowel(s.charAt(i))){
                count--;
            }
            i++;
        }
        j++;
     }
     return maxvowel;

    }

}
