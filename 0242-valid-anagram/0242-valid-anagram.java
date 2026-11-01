class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int fs[]=new int[26];
        int ft[]=new int[26];
        for(int i=0;i<s.length();i++){
            fs[s.charAt(i)-'a']++;
            ft[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(fs[i]!=ft[i]){
                return false;
            }
        }
        return true;
    }
}