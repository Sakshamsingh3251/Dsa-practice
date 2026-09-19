/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode sortList(ListNode head) {
//         ListNode curr = head;
//         ArrayList<Integer> list  = new ArrayList<>();
//         while(curr.next != null){
//             list.add(curr.val);
//             curr = curr.next;

//         }
//         ListNode curr = head;
//         Collection.sort(list);
//         ListNode newnode = new ListNode(list.val);
//         int left = 0;
//         int right = list.size()-1;
//         ListNode temp = list.val;
//         while(left < right){
//             newnode.next = list.val(left++);
            

//         }
//         return curr;
//     }
// }
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode currNew = dummy;

        for (int value : list) {
            currNew.next = new ListNode(value);
            currNew = currNew.next;
        }

        return dummy.next;
    }
}
