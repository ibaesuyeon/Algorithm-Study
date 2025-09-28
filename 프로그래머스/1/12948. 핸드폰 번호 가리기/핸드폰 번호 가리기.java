import java.util.*;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] pnums = phone_number.split("");
        for(int i = pnums.length-5; i>=0; i--){
            pnums[i] = "*";
        }
        for(int i = 0; i<pnums.length; i++){
            answer += pnums[i];
        }
        return answer;
    }
}