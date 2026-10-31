class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int st[]=new int[65536];
        int ts[]=new int[65536];
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(st[a]!=ts[b]){
                return false;
            }
            st[a]=i+1;
            ts[b]=i+1;
        }
        return true;
    }
}