class Solution {
    public String solution(String s) {
        String answer = "";
        String[] chars = s.split("");
        int index = 0;
        for(int i = 0; i<chars.length; i++){
            if(chars[i].equals(" ")){
                answer += chars[i];
                index = 0;
            } else {
                if(index%2 == 0){
                    chars[i] = chars[i].toUpperCase();
                } else {
                    chars[i] = chars[i].toLowerCase();
                }
                answer += chars[i];
                index ++;   
            }               
        }
        return answer;
    }
}