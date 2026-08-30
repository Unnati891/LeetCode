class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        while(left<right){
            int mid=(left+right)/2;
            int hours=0;
            for (int pile : piles) {
                hours += Math.ceil((double) pile / mid);
            }

            if (hours <= h) {
                // mid works, try a smaller speed
                right = mid;
            } else {
                // mid is too slow, need a faster speed
                left = mid + 1;
            }
        }

        return left;
        }
    }