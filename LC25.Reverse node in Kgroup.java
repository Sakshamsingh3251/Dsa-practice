class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevgroup = dummy;
        while(true){
            ListNode kth = prevgroup;

            for(int i = 0 ; i < k && kth != null ; i++){
                kth = kth.next;

            }
            if(kth == null){
                break;
            }
            ListNode groupnext = kth.next;
            ListNode prev = groupnext;
            ListNode curr = prevgroup.next;
            while(curr != groupnext){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            ListNode temp = prevgroup.next;
            prevgroup.next = kth;
            prevgroup = temp;
        }
        return dummy.next;
    }
}
