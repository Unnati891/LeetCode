class Solution {
    public boolean isAnagram(String s, String t) {
        Stack<Character>st=new Stack<>();
        Stack<Character>ts=new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            ts.push(t.charAt(i));
        }
        while(!st.isEmpty()){
            char c=st.pop();
            if(!ts.remove((Character)c)){
                return false;
            }
        }
        return ts.isEmpty();
    }
}