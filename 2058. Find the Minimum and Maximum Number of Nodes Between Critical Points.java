class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        ArrayList<Integer> points = new ArrayList<>();

        int[] res = {-1,-1};
        int index = 1;
        while(curr.next != null){
            if(prev == null){//to handle the not happening of 1st not as cp
                prev = curr;
                curr = curr.next;
                index++;
                continue;

            }
            //Local Maxima(prev < curr && curr > curr.next)
            if(prev.val < curr.val && curr.val > curr.next.val){
                points.add(index);
            }
            //Local Minima(prev > curr && curr < curr.next)
            if(prev.val > curr.val && curr.val < curr.next.val){
                points.add(index);
            }
            prev = curr;
            curr = curr.next;
            index++;
        }
        if(points.size() >= 2){
            int min = Integer.MAX_VALUE;
            for(int i = 1 ; i < points.size(); i++){
                int dist = points.get(i) - points.get(i - 1);
                if(dist < min){
                    min = dist;
                }
            }
            res[0]  = min;
            res[1] = points.get(points.size() - 1) - points.get(0);
        }
        return res;

    }
}
