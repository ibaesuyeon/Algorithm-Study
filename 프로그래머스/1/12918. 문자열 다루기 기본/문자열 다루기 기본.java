class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length() == 4 || s.length() == 6){
            if(!s.matches("^.*[a-zA-Z].*$")){
                answer = true;
            }
        }
        return answer;
    }
}