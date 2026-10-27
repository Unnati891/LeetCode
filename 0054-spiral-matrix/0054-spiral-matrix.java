class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>ls=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        while(left<=right && top<=bottom){
            for(int j=left;j<=right;j++){
                ls.add(matrix[top][j]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ls.add(matrix[i][right]);
            }
            right--;
          if(top<=bottom){
            for(int j=right;j>=left;j--){
                ls.add(matrix[bottom][j]);
            }
            bottom--;
          }
          if(left<=right){
            for(int i=bottom;i>=top;i--){
                ls.add(matrix[i][left]);
            }
            left++;
          }
        }
        return ls;
    }
}