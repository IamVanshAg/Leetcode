class Solution {
    public String interpret(String c) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<c.length(); i++){
            if(c.charAt(i)=='G'){
                sb.append("G");
            }else if(c.charAt(i)=='('){
                if(c.charAt(i+1)==')'){
                    sb.append("o");
                }else if(c.charAt(i+1)=='a' && c.charAt(i+2)=='l' && c.charAt(i+3)==')'){
                    sb.append("al");
                }
            }
        }return sb.toString();
    }
}