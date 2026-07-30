class Solution {
    public int minimumPushes(String word) {
        int press = 0;
        for(int i = 0 ; i < word.length() ; i++){
            if(i < 8){
                press += 1;
            }
            else if(i < 16){
                press += 2;
            }
            else if(i < 24){
                press += 3;
            }
            else{
                press += 4;
            }
        }
        return press;
    }
}
//  Position | Pushes 
//
//  1–8      | 1      
//  9–16     | 2      
//  17–24    | 3      
//  25–26    | 4
