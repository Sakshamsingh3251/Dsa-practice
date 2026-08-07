/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        int  lengthA = 0;
        while(temp1 != null){
            temp1 = temp1.next;
            lengthA++;
        }
        ListNode temp2 = headB;
        int lengthB = 0…temp1 = headA;
        temp2 = headB;
        if(lengthA > lengthB){//temp1 ko utna  aage bhejenge(lengthA - lengthB)
            for(int i = 1 ; i  <= lengthA - lengthB;i++){
                temp1 = temp1.next;
            }
        }else{//temp2 ko utna aage bhejenge (lengthB - lengthA)
            for(int i = 1 ; i<= lengthB - lengthA ; i++){
                temp2 = temp2.next;
            }

        }
        while(temp1 != temp2){
            temp1= temp1.next;
            temp2= temp2.next;
        }
        return temp1;
        
    }
}
