class Solution {
    private boolean Validate(Stack<Character> st , String part , int n){
        Stack<Character> tempSt = new Stack<>();
        tempSt.addAll(st);

        for(int index = n - 1 ; index >= 0 ; index--){
            if(tempSt.peek() != part.charAt(index)){
                return false;
            }
            tempSt.pop();
        }
        return true;
    }
    public String removeOccurrences(String s, String part) {
        Stack<Character> st = new Stack<>();
        int m = s.length();
        int n = part.length();

        for(int i = 0 ; i < m ; i++){
            st.push(s.charAt(i));

            if(st.size() >= part.length() && Validate(st , part , n)){
                for(int j = 0 ; j < n ;j++){
                    st.pop();
                }
            }
        }
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
}
