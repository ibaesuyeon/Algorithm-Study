class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        s = s.toLowerCase();
        String[] ss = s.split("");
        for(int i = 0; i<ss.length; i++){
            if(ss[i].equals("p")){
                p++;
            } else if(ss[i].equals("y")){
                y++;
            }
        }
        if(p != y){
            answer = false;
        }
        return answer;
    }
}