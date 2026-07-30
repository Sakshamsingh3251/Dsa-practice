class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(int i = 0 ; i< word.length() ; i++){
            freq[word.charAt(i) - 'a']++;

        }
        Arrays.sort(freq);
        int answer = 0;
        for(int i = 25 ; i >= 0 ; i--){
            if(freq[i] == 0){
                break;
            }
            int position = 25 - i;
            int press = (position / 8) + 1;

            answer += freq[i] * press;
        }
        return answer;
    }
}
