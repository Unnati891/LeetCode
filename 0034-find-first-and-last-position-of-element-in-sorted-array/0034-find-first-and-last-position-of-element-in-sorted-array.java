class Solution {
    public int[] searchRange(int[] nums, int target) {

        // Find first occurrence
        int left = 0;
        int right = nums.length - 1;
        int first = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } 
            else if (nums[mid] > target) {
                right = mid - 1;
            } 
            else {
                first = mid;
                right = mid - 1; // keep searching left
            }
        }

        // Find last occurrence
        left = 0;
        right = nums.length - 1;
        int last = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } 
            else if (nums[mid] > target) {
                right = mid - 1;
            } 
            else {
                last = mid;
                left = mid + 1; // keep searching right
            }
        }

        return new int[]{first, last};
    }
}