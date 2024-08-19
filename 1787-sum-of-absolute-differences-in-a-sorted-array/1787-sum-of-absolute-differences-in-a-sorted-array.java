class Solution {
    public int[] getSumAbsoluteDifferences(int[] arr) {
        int n = arr.length;
        int pre_fix[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                pre_fix[i] = arr[i];
            } else
                pre_fix[i] = arr[i] + pre_fix[i + 1];
        }
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            int left = Math.abs(i * arr[i] - (pre_fix[0] - pre_fix[i]));
            int right = Math.abs((n - i - 1) * arr[i] - (pre_fix[i] - arr[i]));
            ans[i] = left + right;
        }
        return ans;

    }
}