class Solution {
    public String solution(String s) {
        String[] ss = s.split("");
        int i = ss.length/2;
        if(ss.length%2 == 0){
            return ss[i-1] + ss[i];
        } else 
            return ss[i];
    }
}