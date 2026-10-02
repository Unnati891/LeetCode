class Solution {
    public int splitArray(int[] nums, int k) {
        int left=0;
        int right=0;
        for(int num:nums){
            left=Math.max(num,left);
            right+=num;
        }
        while(left<=right){
            int mid=(left+right)/2;
            int curSum=0;
            int split=1;
            for(int num:nums){
                if(curSum+num<=mid){
                    curSum+=num;
                }
                else{
                    split++;
                    curSum=num;
                }
            }
            if(split<=k){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}