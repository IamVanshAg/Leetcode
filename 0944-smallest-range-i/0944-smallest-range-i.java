class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int min_val = nums[0];
        int max_val = nums[nums.length-1];
        if(min_val + k >= max_val - k){
            return 0;
        }else{
            return (max_val-k) - (min_val+k);
        }
    }
}