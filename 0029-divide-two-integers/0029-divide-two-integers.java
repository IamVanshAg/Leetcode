class Solution {
    public int divide(int a, int b) {
        int count= 0;
        long t1 = Math.abs((long)a);
        long t2 = Math.abs((long)b);
        if(a==-2147483648 && b==-1) return 2147483647;
        while (t1 >= t2) {
            long temp = t2, multiple = 1;
            while (t1 >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            t1 -= temp;
            count += multiple;
        }
        if((a<0 && b>0) || (a>0 && b<0)){
            return -count;
        }else{
            return count;
        }
    }
}