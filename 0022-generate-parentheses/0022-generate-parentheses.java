class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ls=new ArrayList<>();
        // int open=0;
        // int close=0;
        // String curr="";
        createPar(n,0,0,"",ls);
        return ls;
    }
    public void createPar(int n,int open,int close,String curr,List<String>ls){
        if(open==n && close==n){
            ls.add(curr);
            return;
        }
        if(open<n){
            createPar(n,open+1,close,curr+"(",ls);
        }
        if(close<open){
            createPar(n,open,close+1,curr+")",ls);
        }
    }
}