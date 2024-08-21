class Solution {
    public int arraySign(int[] nums) {
        int Ncount = 0;
        for (int num : nums) {
            if(num==0){
                return 0;
            }
            if(num<0){
                Ncount++;
            }
        }
        if(Ncount%2==0){
            return 1;
        }else{
            return -1;
        }
    }
}