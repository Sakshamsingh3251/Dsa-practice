class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        long x = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 0) {
                x = x * 10 + digit;
                sum = sum + digit;
            }

            n = n / 10;
        }
        long reverse = 0;

        while (x > 0) {
            reverse = reverse * 10 + (x % 10);
            x = x / 10;
        }

        return reverse * sum;
    }
}
