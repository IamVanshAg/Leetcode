class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for(int i = 0; i< queries.length; i++){
            int x = queries[i][0];
            int y = queries[i][1];
            int z = queries[i][2];
            for(int j=0;j<points.length;j++){
                int a = points[j][0];
                int b = points[j][1];
                if(Math.pow(x-a,2)+Math.pow(y-b,2)<=Math.pow(z,2)){
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}