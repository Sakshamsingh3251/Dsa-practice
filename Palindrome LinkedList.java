class Solution {
    public ListNode reverselist(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode last = reverselist(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reversehead =  reverselist(slow);
        prev.next = null;

        while(reversehead != null && head != null){
            if(reversehead.val != head.val){
                return false;
            }
            reversehead = reversehead.next;
            head = head.next;
        }
        return true;
    }
}
