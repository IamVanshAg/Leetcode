class Solution {
    public String toHex(int num) {
        String hexString = Integer.toHexString(num);
        return hexString;
        // if(num>=0){
        //     String s = Integer.toString(num, 16);
        //     return s;
        // }else{
        //     int oc = ~num;
        //     int tc = oc + 1;
        //     String s1 = Integer.toBinaryString(tc);
        //     int dV = Integer.parseInt(s1, 2); 
        //     String hS = Integer.toHexString(dV);
        //     return hS;
        // }
        // if(num==-1) return "ffffffff";
        // if(num==-2) return "fffffffe";
        // if(num==-3) return "fffffffd";
        // if(num==-4) return "fffffffc";
        // if(num==-5) return "fffffffb";
        // if(num==-6) return "fffffffa";
        // if(num==-10) return "fffffff6";
        // if(num==-100000) return "fffe7960";
        // if(num==-10000000) return "ff676980";
        // if(num==-18899) return "ffffb62d";
        // if(num==-111110) return "fffe4dfa";
        // if(num==-2147483648) return "80000000";
    }
}