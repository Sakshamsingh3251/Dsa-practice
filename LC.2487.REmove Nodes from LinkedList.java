//Using Recursion
class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode nextnode = removeNodes(head.next);

        if(head.val < nextnode.val){
            head = null;
            return nextnode;
        }
        head.next = nextnode;
        return head;
    }
}
//using stack
// class Solution{
//     public ListNode removeNodes(ListNode head){
//         Stack<ListNode> st = new Stack<>();
//         ListNode curr = head;

//         while( curr != null){
//             st.push(curr);
//             curr = curr.next;
//         }
//         curr = st.pop();
//         int max = curr.val;
//         ListNode resulthead = new ListNode(max);

//         while(!st.empty()){
//             curr = st.pop();
//             if(curr.val < max){
//                 continue;
//             }
//             else{
//                 ListNode newNode = new ListNode(curr.val);
//                 newNode.next = resulthead;
//                 resulthead = newNode;
//                 max = curr.val;
            

//             }
//         }
//         return resulthead;
//     }
// }
