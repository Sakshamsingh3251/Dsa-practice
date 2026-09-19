class Solution {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int left=0;
        int right= list.size()-1;
        int max=Integer.MIN_VALUE;
        while(left < right){
            int curSum = list.get(left) + list.get(right);
            left++;
            right--;
            if(curSum > max){
                max = curSum;

            }
            
        }
        return max;
        
    }
}
