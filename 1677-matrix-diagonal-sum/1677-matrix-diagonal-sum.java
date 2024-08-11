class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1 = 0, sum2 = 0;
        int n = mat.length;
        for(int i = 0; i<n; i++){
            sum1 += mat[i][i];
            sum2 += mat[i][n-1-i];
        }
        if(n%2==0){
            return sum1 + sum2;
        }else{
            return sum1 + sum2 - mat[(n-1)/2][(n-1)/2];
        }
    }
}