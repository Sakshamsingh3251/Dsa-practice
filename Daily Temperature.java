class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] days = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        stack.push(0);  // pushed the first index in the stack as start of the array(temperatures)

        for(int i = 1 ; i < temperatures.length ; i++){
            int currenttemp = temperatures[i];
            
            while(!stack.isEmpty()){
                int index = stack.peek();
                int temptop = temperatures[index];
                if(temptop < currenttemp){
                    days[index] = i - index;
                    stack.pop();
                }else{
                    break;
                }
            }
            stack.push(i);
        }
        return days;

    }
}
