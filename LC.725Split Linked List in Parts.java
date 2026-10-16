class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode curr = head;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        int eachbucketnode = length/k;
        int remaindernode = length%k;

        ListNode[] result = new ListNode[k];
        curr = head;
        ListNode prev = null;


        for(int i = 0 ; i < k && curr != null ; i++ ){//for the parts(buckets)
           result[i] = curr;

           for(int count = 1 ; count <= eachbucketnode + (remaindernode > 0 ? 1 : 0) ; count++){
            prev = curr;
            curr = curr.next;
           }
           if(prev != null){
            prev.next = null;
           }
           remaindernode--;

        }
        return result;
    }
}
