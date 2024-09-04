class Solution {
    public int minimumSum(int num) {
        List<Integer> list = new ArrayList<>();
        while(num>0){
            list.add(num%10);
            num /= 10;
        }
        Collections.sort(list);
        int n1 = 0, n2 = 0;
        for(int i = 0; i<list.size(); i++){
            if(i%2==0){
                n1 *= 10;
                n1 += list.get(i);
            }else{
                n2 *= 10;
                n2 += list.get(i);
            }
        }
        return n1+n2;
    }
}