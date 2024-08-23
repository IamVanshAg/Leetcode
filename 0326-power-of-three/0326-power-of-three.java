class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        double logResult = Math.log(n) / Math.log(3);
        return Math.abs(logResult - Math.round(logResult)) < 1e-10;
    }
}
