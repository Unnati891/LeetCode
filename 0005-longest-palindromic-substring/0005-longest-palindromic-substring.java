class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            String odd=pchck(s,i,i);
            String evn=pchck(s,i,i+1);
            if(odd.length()>ans.length()){
                ans=odd;
            }
            if(evn.length()>ans.length()){
                ans=evn;
            }
        }
        return ans;
    }
    public String pchck(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right) ){
           left--;
           right++;
        }
        return s.substring(left+1,right);
    }
}