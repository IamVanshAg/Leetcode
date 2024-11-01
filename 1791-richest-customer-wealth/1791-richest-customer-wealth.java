class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<m; j++){
                int temp = accounts[i][j];
                sum += temp;
            }
            arr[i]=sum;
        }
        Arrays.sort(arr);
        return arr[n-1];
    }
}