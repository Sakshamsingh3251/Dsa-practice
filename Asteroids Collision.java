class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int  a : asteroids){
            while(!stack.isEmpty() &&  a < 0 && stack.peek() > 0){
                int sum = stack.peek() + a;

                if(sum < 0){//left se ane vla ulkapind(-ve)
                    stack.pop();
                }
                else if(sum > 0){// right me jane vla +ve ulkapind
                    a = 0 ;//ane vle ulkapind khtm ho jaeyga
                    break;
                }else{//dono ulkapind same oppostive position me hai
                    stack.pop();
                    a = 0;


                }
            }
            if( a != 0){
                stack.push(a);
            }
        }
        int[] ans = new int[stack.size()];
        for(int i = stack.size()-1 ; i >= 0 ; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}
