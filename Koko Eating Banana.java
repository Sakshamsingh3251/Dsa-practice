class Solution {
    // Checks karna hai koko sare bananas kha sakta hai kya
    // if she eats 'speed' bananas per hour
    public boolean canEatAll(int[] piles, int speed, int h) {

        int hours = 0;

        for (int bananas : piles) {

            hours += bananas / speed;

            if (bananas % speed != 0) {
                hours++;
            }
        }

        return hours <= h;//diye gye samay me kha pa rhi hai kya
    }

    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;

        int right = 0;
        for (int bananas : piles) {
            right = Math.max(right, bananas);//right ka sabse bada element dudhne ke liye
        }
        while (left < right) {

            int mid = left + (right - left) / 2;

            if (canEatAll(piles, mid, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
