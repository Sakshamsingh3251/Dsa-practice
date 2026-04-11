class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> lostMap = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            int loser = matches[i][1];
            lostMap.put(loser, lostMap.getOrDefault(loser, 0) + 1);
        }

        List<Integer> notLost = new ArrayList<>();
        List<Integer> lostOnce = new ArrayList<>();

        for (int i = 0; i < matches.length; i++) {
            int winner = matches[i][0];
            int loser = matches[i][1];

            if (!lostMap.containsKey(winner)) {
                notLost.add(winner);
                lostMap.put(winner, 2); 
            }
            if (lostMap.get(loser) == 1) {
                lostOnce.add(loser);
            }
        }

        Collections.sort(lostOnce);
        Collections.sort(notLost);

        List<List<Integer>> result = new ArrayList<>();
        result.add(notLost);
        result.add(lostOnce);

        return result;
    }
}
