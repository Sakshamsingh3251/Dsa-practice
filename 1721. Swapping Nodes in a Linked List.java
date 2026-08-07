class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int length = 0;
        while( temp != null){
            temp = temp.next;
            length++;
        }
        
        
        int swapoint2 = length - k;


        ListNode prev = head;
        

         for(int i = 1 ; i < k ; i++){//as mentioned list is one indexed
            prev = prev.next;
        }
        ListNode prev2 = head;
        //ListNode temp2 = prev;
        // while(temp2.next != null){
        //     temp2 = temp2.next;
        //     prev2 = prev2.next;
        // }
        for(int  i = 0 ; i < swapoint2 ; i++){
            prev2 = prev2.next; 
        }
        
        int value = prev.val;
        prev.val = prev2.val;
        prev2.val = value;


        return head;
    }
}
