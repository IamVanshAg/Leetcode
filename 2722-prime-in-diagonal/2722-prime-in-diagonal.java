class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(isPrime(nums[i][i])){
                list.add(nums[i][i]);
            }
            if(isPrime(nums[n-i-1][i]) && i!=n-i-1){
                list.add(nums[n-i-1][i]);
            }
        }
        list.sort(Comparator.reverseOrder());
        if (!list.isEmpty()) {
            return list.get(0); 
        } else {
            return 0;
        }
    }
    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        if (a == 2 || a == 3) {
            return true;
        }
        if (a % 2 == 0 || a % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= a; i += 6) {
            if (a % i == 0 || a % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}