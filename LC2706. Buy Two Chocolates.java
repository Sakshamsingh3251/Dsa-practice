class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int totalprice = prices[0] + prices[1];

        if(totalprice <= money) {
            return money - totalprice;

        }
        return money;
    }
}
