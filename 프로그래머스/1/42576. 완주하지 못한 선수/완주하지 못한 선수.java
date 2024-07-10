import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<participant.length; i++) {
            //집가고싶다
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        for(int i = 0; i<completion.length; i++){
            //진짜집가고싶다
            if(map.get(completion[i]) == 1)
                map.remove(completion[i]);
            else map.put(completion[i], map.get(completion[i])-1);
        }
        String str = map.toString().split("=")[0].replace("{", "");
        return str;
    }
}