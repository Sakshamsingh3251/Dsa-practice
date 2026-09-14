class Solution {
    public ListNode removeElements(ListNode head, int val) {
        public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode curr = head;
        ListNode pre = null;
        while (curr != null) {
            if (curr.val == val) {
                pre.next = curr.next;
            } else {
                pre = curr;
            }

            curr = curr.next;
        }

        return head;
        
    }
}
