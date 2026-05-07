class Solution {

    public int[] countOppositeParity(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int count = 0;

            // Check whether current number is even
            boolean isEven = false;

            if (nums[i] % 2 == 0) {
                isEven = true;
            }

            // Traverse from current index to end
            for (int j = i; j < n; j++) {

                // If current number is even,
                // count odd numbers
                if (isEven) {

                    if (nums[j] % 2 != 0) {
                        count++;
                    }

                } 
                
                // If current number is odd,
                // count even numbers
                else {

                    if (nums[j] % 2 == 0) {
                        count++;
                    }
                }
            }

            // Store count at current index
            nums[i] = count;
        }

        return nums;
    }
}
