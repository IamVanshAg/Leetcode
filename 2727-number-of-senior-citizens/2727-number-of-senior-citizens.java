class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i =0; i<details.length;i++){
            if(details[i].charAt(11)>='6'){
                if(details[i].charAt(11)=='6' && details[i].charAt(12)=='0'){
                    continue;
                }count++;
            }
        }return count;
    }
}