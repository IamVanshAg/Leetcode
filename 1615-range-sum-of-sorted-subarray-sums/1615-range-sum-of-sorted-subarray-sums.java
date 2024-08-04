class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int MOD = 1000000007;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i< n; i++){
            int sum = 0;
            for (int j = i; j<n; j++){
                sum += nums[j];
                list.add(sum);
            }
        }
        Collections.sort(list);
        long rangeSum = 0;
        for(int i = left-1; i<right; i++){
            rangeSum = (rangeSum + list.get(i)) % MOD;
        }
        return (int) rangeSum;
    }
}