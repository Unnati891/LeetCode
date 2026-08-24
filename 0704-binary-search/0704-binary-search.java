class Solution {
    public int srchHalf(int nums[],int left,int right,int target){
        if(left>right){
            return -1;
        }
        int mid=(left+right)/2;
        if(target==nums[mid]){
            return mid;
        }else if(target<nums[mid]){
            return srchHalf(nums,left,mid-1,target);
        }else{
            return srchHalf(nums,mid+1,right,target);
        }
    }
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        return srchHalf(nums,left,right,target);
    }
}