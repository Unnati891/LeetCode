class Solution {
    public int maxProduct(int[] nums) {
        int Min=nums[0];
        int Max=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int oldMin=Min;
            int oldMax=Max;
            int newMin=Math.min(curr,Math.min(oldMin*curr,oldMax*curr));
            int newMax=Math.max(curr,Math.max(oldMin*curr,oldMax*curr));
            Min=newMin;
            Max=newMax;
            ans=Math.max(ans,Max);
        }
        return ans;
    }
}