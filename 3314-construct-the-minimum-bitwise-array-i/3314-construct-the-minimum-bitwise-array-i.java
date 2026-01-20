class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int x = nums.get(i);

            if (x == 2) {
                ans[i] = -1;
                continue;
            }

            // Count trailing ones in x
            int r = 0;
            int temp = x;
            while ((temp & 1) == 1) {
                r++;
                temp >>= 1;
            }

            // Flip the (r-1)-th bit
            ans[i] = x ^ (1 << (r - 1));
        }

        return ans;
    }
}
