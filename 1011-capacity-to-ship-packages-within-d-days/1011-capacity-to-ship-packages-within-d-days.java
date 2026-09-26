
class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        // Find minimum and maximum possible capacity
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int requiredDays = 1;
            int currentWeight = 0;

            for (int weight : weights) {

                if (currentWeight + weight <= mid) {
                    currentWeight += weight;
                } else {
                    requiredDays++;
                    currentWeight = weight;
                }
            }

            if (requiredDays <= days) {
                // Capacity works, try smaller capacity
                right = mid - 1;
            } else {
                // Capacity is too small, increase it
                left = mid + 1;
            }
        }

        return left;
    }
}