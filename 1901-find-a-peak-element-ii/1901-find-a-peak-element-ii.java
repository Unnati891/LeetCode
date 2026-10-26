class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int left=0;
        int right=m-1;
        while(left<=right){
            int mid=(left+right)/2;
            int maxRow=0;
            int maxVal=mat[0][mid];
            for(int i=1;i<n;i++){
                if(maxVal<mat[i][mid]){
                    maxVal=mat[i][mid];
                    maxRow=i;
                }
            }
            int leftVal=(mid>0)?mat[maxRow][mid-1]:-1;
            int rightVal=(mid<m-1)?mat[maxRow][mid+1]:-1;
            if(maxVal>leftVal && maxVal>rightVal){
                return new int[]{maxRow,mid};
            }
            else if(maxVal<rightVal){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}