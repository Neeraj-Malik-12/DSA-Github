class Solution {
    public int maximumCount(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int indexOne = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
                indexOne = mid;
            }

        }
        low = 0;
        high = nums.length - 1;
        int indexTwo = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
                indexTwo = mid;
            }
        }

        int negativeCount = indexOne + 1;
        int positiveCount;
        if (indexTwo == -1)
            positiveCount = 0;
        else
            positiveCount = nums.length - indexTwo;

        return Math.max(negativeCount, positiveCount);
    }
}
