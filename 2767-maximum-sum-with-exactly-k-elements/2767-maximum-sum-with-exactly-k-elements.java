class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int n = nums.length;
        int b = nums[n-1];
        for(int i = 0; i<k; i++){
            sum+=b;
            b++;
        }
        return sum;
    }
}