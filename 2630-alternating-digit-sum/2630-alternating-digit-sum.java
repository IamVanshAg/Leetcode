class Solution {
    public int alternateDigitSum(int n) {
        int sum1 = 0;
        int sum2 = 0;
        int i = (int)Math.floor(Math.log10(n) + 1);
        while(n!=0){
            if(i%2!=0){
                sum1 += n%10;
            }else{
                sum2 += n%10;
            }
            n = n/10;
            i--;
        }return sum1-sum2;
    }
}