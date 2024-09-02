class Solution {
    public int numJewelsInStones(String jew, String ston) {
        int count = 0;
        for(int i = 0; i<ston.length();i++){
            for(int j = 0;j<jew.length();j++){
                if(ston.charAt(i)==jew.charAt(j)){
                    count++;
                }
            }
        }return count;
    }
}