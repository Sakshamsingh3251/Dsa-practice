class Solution {
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return last;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        int sum = 0;
        int carry = 0;

        ListNode ans = new ListNode(0);
        while(l1 != null || l…+= l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            ans.val = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(carry);
            newNode.next = ans;
            ans = newNode;

            sum = carry;
            
        }
        if(carry == 0){
            return ans.next;
        }
        else {
            return ans;
        }
    }
}
