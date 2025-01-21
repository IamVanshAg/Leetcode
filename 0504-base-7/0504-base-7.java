class Solution {
    public String convertToBase7(int num) {
        int temp = num;
        int sign = 0;
        String ans = "";
        if(num < 0){
            temp = -num;
            sign = 1;
        }
        while(temp >= 7){
            ans = (temp % 7) + ans ;
            temp  = temp / 7 ;
        }
        ans = temp + ans;
        if(sign == 0){
            return ans;
        }
        else{
            ans = "-" + ans;
            return ans;
        }  
    }
}