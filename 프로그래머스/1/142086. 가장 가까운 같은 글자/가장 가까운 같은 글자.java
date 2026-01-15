import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = s.split("");
        for(int i = 0; i<arr.length; i++){
            if(map.get(arr[i]) == null){
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(arr[i]);
            }
            map.put(arr[i], i);
        }
        return answer;
    }
}