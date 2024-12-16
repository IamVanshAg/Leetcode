class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        for (int i = 0; i < k; i++) {
            int minIndex = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            nums[minIndex] *= m;
        }
        return nums;
    }
}