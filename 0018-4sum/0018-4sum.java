class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ls=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int left=j+1;
                int right=nums.length-1;
                if(i>0 && nums[i]==nums[i-1]){
                    continue;
                }
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                while(left<right){
            long ans=(long) nums[i]+nums[j]+nums[left]+nums[right];
            if(ans==target){
                ls.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                while(left<right && nums[left]==nums[left+1]){
                    left++;
                }
                while(left<right && nums[right]==nums[right-1]){
                    right--;
                }
                    right--;
                    left++;
            }else if(ans<target){
                left++;
            }else{
                right--;
            }
        }
            }
        }
        return ls;
    }
}