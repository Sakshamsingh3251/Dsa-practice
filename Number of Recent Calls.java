class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
         queue = new LinkedList<>();//empty queue banaya hai
        
    }
    
    public int ping(int t) {
        queue.offer(t);//new request jo recent me aya hai use add kar diya

        while(queue.peek() < t - 3000){//un requests ko remove kiya hai jo t - 3000 se chota hai ( mtlb purana hai " front me  first vala hai")
            queue.poll(); 

        }
        return queue.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
