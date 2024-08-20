class Solution {
    public int maximumPrimeDifference(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                list.add(i);
            }
        }
        int n = list.size();
        int m = list.get(n - 1) - list.get(0);
        return m;
    }

    private static boolean isPrime(int p) {
        if (p <= 1) {
            return false;
        }
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
}