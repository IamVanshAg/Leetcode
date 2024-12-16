class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0; 
        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i];
            int maxDigit = 0; 
            int digitsPattern = 0; 
            
            while (num > 0) {
                maxDigit = Math.max(maxDigit, num % 10); 
                num /= 10; 
                digitsPattern = digitsPattern * 10 + 1; 
            }
            sum += digitsPattern * maxDigit;
        }
        return sum;
    }
}
