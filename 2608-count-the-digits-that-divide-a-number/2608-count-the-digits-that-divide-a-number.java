class Solution {
    public int countDigits(int num) {
        int count = 0;
        int ans = num;
        while (ans > 0) {
            int dig = ans % 10;
            ans /= 10;
            if (num % dig == 0) {
                count++;
            }
        }
        return count;
    }
}