class Solution {
    // private boolean isValid(StringBuilder str){
    //     int sum = 0;
    //     for(char ch : str){
    //         if(ch == '('){
    //             sum++;
    //         }else{
    //             sum--;
    //         }
    //         if(sum < 0){
    //             return false;
    //         }
    //     }
    //     return sum == 0;
    // }
    //isValid function can be removed because we already checked valid / not valid with open and close check(open < n , close < open) , which make all parethesis in the recursion already valid to iterate..........
    private void generate(int n , StringBuilder curr , int open , int close, ArrayList<String> result){
        if(curr.length() == 2*n){
            result.add(curr.toString());
            return;
        }
        if(open < n ){//open ka count total no. of opening bracket se kam hi hoga
            curr.append('(');
            generate(n , curr , open + 1 , close , result);
            curr.deleteCharAt(curr.length() - 1);
        }
        if(close < open){// closed ke liye hamesha open se kam hi hoga tabhii valid)
            curr.append(')');
            generate(n , curr , open , close + 1, result);
            curr.deleteCharAt(curr.length() - 1);
        }

    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();

        StringBuilder curr = new StringBuilder();
        generate(n , curr , 0 , 0 , result);
        return result;
    }
}
