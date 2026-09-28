class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int weight:weights){
            left=Math.max(left,weight);
            right+=weight;
        }
        while(left<=right){
            int mid=(left+right)/2;
            int rqDay=1;
            int curWt=0;
            for(int weight:weights){
                if(curWt+weight<=mid){
                curWt+=weight;
                }else{
                rqDay++;
                curWt=weight;
                }
            }
            if(rqDay<=days){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}