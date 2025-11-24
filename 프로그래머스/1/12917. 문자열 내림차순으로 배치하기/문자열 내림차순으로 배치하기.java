import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for(char a : arr){
            answer = String.valueOf(a) + answer;
        }
        return answer;
    }
}