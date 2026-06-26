class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength=0;
        int left=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int right=0;right<s.length();right++){
            Character c=s.charAt(right);
            if(hm.containsKey(c)){
                left=Math.max(left,hm.get(c)+1);
            }
            hm.put(c,right);
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}