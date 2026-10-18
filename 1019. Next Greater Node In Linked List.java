//Brute Force:
// class Solution {
//     public int[] nextLargerNodes(ListNode head) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         ListNode curr = head;

//         while(curr != null){
//             int greater = 0;
//             ListNode temp = curr.next;

//             while(temp != null){
//                 if(temp.val > curr.val){
//                     greater = temp.val;
//                     break;
//                 }
//                 temp = temp.next;
//             }
//             ans.add(greater);
//             curr = curr.next;
//         }
//         int[] result = new int[ans.size()];
//         for(int i = 0 ; i < ans.size() ; i++){
//             result[i] = ans.get(i);

//         }
//         return result;
//     }
// }
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> nums = new ArrayList<>();

        while(head != null){
            nums.add(head.val);
            head = head.next;
        }
        int n = nums.size();
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i = n - 1 ; i >= 0 ; i--){
            while(!stack.isEmpty() && stack.peek() <= nums.get(i)){
                stack.pop();
            }

                if(!stack.isEmpty()){
                    ans[i] = stack.peek();
                }
                
            
            stack.push(nums.get(i));
        }
        return ans;
    }
}
