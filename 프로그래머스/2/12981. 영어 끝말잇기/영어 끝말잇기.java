import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashSet<String> set = new HashSet<>();
        set.add(words[0]);
        String last = words[0].substring(words[0].length()-1, words[0].length());
        
        for(int i = 1; i<words.length; i++){
            String word = words[i];
            String first = word.substring(0,1);
            if(set.contains(word) || !first.equals(last)){
                answer[0] = i%n + 1;
                answer[1] = i/n + 1;
                break;
            }
            if (first.equals(last)){
                last = word.substring(word.length()-1, word.length());
                set.add(words[i]);            
            }
        }
        return answer;
    }
}