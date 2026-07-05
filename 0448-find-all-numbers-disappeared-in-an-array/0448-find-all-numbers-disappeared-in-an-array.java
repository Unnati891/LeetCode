class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        List<Integer>ans=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}