class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int count = 0;

        Arrays.sort(arr2);

        for (int num : arr1) {
            if (binarySearch(arr2, num, d)) {
                count++;
            }
        }

        return count;
    }

    private boolean binarySearch(int[] arr2, int num, int d) {

        int left = 0;
        int right = arr2.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (Math.abs(num - arr2[mid]) <= d) {
                return false;
            }

            if (arr2[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return true;
    }
}
