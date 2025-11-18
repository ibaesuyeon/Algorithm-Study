class Solution {
    public String solution(String s) {
        String[] ss = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<ss.length; i++){
            int num = Integer.valueOf(ss[i]);
            if(max <= num){
                max = num;
            }
            if(min >= num){
                min = num;
            }
        }
        String answer = min + " " + max;
        return answer;
    }
}