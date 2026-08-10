class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if( head == null || head.next == null || k == 0){
            return head;
        }
        int  length = 1;//including head node
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }
        
        k = k % length;
        if( k == 0){
            return head;
        }
        int remainingnodes = length - k ;
        // now connect karo tai…    // ListNode newtail = new ListNode(remainingnodes);
        ListNode newtail = head;
        for(int i = 1 ; i < remainingnodes ; i++){
            newtail = newtail.next;
        }
        ListNode newhead = newtail.next;
        newtail.next = null;


        return newhead;
        
//linkedlist ko length - k pe jake do part me tod kar jaha par length - k hai usko naya tail bana diya , aur old tail ko head se point kara diya , last me newatil.next -> newhead ko return kara diya;


    }
}
