class Solution {
    public int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            int Dsum = 0;
            int copy = i;
            while (copy != 0) {
                Dsum += copy % 10;
                copy /= 10;
            }
            if (Dsum % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}