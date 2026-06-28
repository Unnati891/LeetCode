class Solution {
    public int reverse(int x) {
        int ls=0;
        int rev=0;
        while(x!=0){
            ls=x%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev=rev*10+ls;
            x=x/10;
        }
        return rev;
    }
}