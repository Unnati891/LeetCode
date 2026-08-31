class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;

        for (int num : nums) {
            right = Math.max(right, num);
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            int div = 0;

            for (int i = 0; i < nums.length; i++) {
                div += Math.ceil((double) nums[i] / mid);
            }

            if (div <=threshold ) {
                // divisor works → try smaller
                right = mid;
            } else {
                // divisor doesn't work → need bigger
                left = mid + 1;
            }
        }

        return left;
    }
}