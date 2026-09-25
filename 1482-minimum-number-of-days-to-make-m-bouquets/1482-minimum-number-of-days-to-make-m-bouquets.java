class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int left=1;
        int right=0;
        for(int blomDay:bloomDay){
            right=Math.max(blomDay,right);
        }
        if((long)k*m>bloomDay.length){
            return -1;
        }
        while(left<=right){
            int mid=(left+right)/2;
            int consecutive=0;
            int bouquets=0;
            for(int blomDay:bloomDay){
                if(blomDay<=mid){
                    consecutive++;
                }
                else{
                    consecutive=0;
                }
                if(consecutive==k){
                    bouquets++;
                    consecutive=0;
                }
            }
                if(bouquets>=m){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
        }
        return left;
    }
}