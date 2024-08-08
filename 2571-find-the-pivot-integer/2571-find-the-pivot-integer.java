class Solution {
    public int pivotInteger(int n) {
        int num = n * (n + 1) / 2;
        double x = Math.sqrt(num);
        int m = (int)Math.floor(x);
        if((x - m) == 0){
            return m;
        }else{
            return -1;
        }
    }
}