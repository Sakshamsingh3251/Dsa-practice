class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (a, b) -> Integer.compare(a[1], b[1]));

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0] ,b[0]));
        int currPassengers = 0;
        for(int[] trip : trips){
            int passengers = trip[0];
            int start =trip[1];
            int end = trip[2];

            while(!pq.isEmpty() && pq.peek()[0] <= start){
                int[] completedtrip = pq.poll();
                currPassengers -=  completedtrip[1];

            }
            currPassengers += passengers;

            if(currPassengers > capacity){
                return false;
            }
            pq.add(new int[]{end , passengers});
        }
        return true;

       

    }
}
// class Solution {
//     public boolean carPooling(int[][] trips, int capacity) {
//         TreeMap<Integer, Integer> events = new TreeMap<>();

//         for (int[] trip : trips) {
//             int passengers = trip[0];
//             int start = trip[1];
//             int end = trip[2];

//             events.put(start, events.getOrDefault(start, 0) + passengers);
//             events.put(end,   events.getOrDefault(end, 0) - passengers);
//         }

//         int currentPassengers = 0;

//         for (int change : events.values()) {
//             currentPassengers += change;
//             if (currentPassengers > capacity) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }
