class Solution {
    public boolean isHappy(int n) {
        int s = n;
        Set<Integer> set = new HashSet<>();
        while(s!=1 && !set.contains(s)){
            n=s;
            s=0;
            set.add(n);
            while(n!=0){
                s+=Math.pow(n%10, 2);
                n /= 10;
            }
        }
        if(s==1){
            return true;
        }else{
            return false;
        }
    }
}