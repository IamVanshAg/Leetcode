class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[(nums.length) - 1];
        return gcd(a, b);
    }

    public int gcd(int x, int y) {
        if (y % x == 0) {
            return x;
        }
        else{
            return gcd(y%x,x);
        }
    }
}