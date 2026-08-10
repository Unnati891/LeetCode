class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        List<Integer>ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            if(entry.getValue()>nums.length/3){
                ls.add(entry.getKey());
            }
        }
        return ls;
    }
}