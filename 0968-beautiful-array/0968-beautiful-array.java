class Solution {
    public int[] beautifulArray(int n) {
        int[] nums = new int[n];
        if(n==1){
            return new int[] {1};
        }
        else if(n==2){
            return new int[] {1,2};
        }
        else{
            int[] odds = beautifulArray((n+1)/2);
            int[] even = beautifulArray(n/2);
            for(int i =0; i<odds.length; i++){
                nums[i] = odds[i]*2-1;
            }
            for(int j = 0; j<even.length; j++){
                nums[odds.length+j]=even[j]*2;
            }
        }
        return nums;
    }
}