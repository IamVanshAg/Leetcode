class Solution {
    public int numWaterBottles(int n, int ex) {
        int ans=n;
        while(n>=ex){
            int em = n/ex;
            ans +=em;
            n = em + n%ex;
        }return ans;
    }
}