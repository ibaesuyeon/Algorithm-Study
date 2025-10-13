import java.time.*;
import java.time.format.*;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // int[] answer = new int[privacies.length];
        List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<terms.length; i++){
            StringTokenizer st = new StringTokenizer(terms[i]);
            map.put(st.nextToken().charAt(0), Integer.parseInt(st.nextToken()));
        }
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        for(int i = 0; i<privacies.length; i++){
            StringTokenizer st = new StringTokenizer(privacies[i]);            
            LocalDate collected = LocalDate.parse(st.nextToken(), format);
            char term = st.nextToken().charAt(0);
            LocalDate criterion = LocalDate.parse(today, format);
            
            // System.out.println("약관종료일 : " + collected.plusMonths(map.get(term)) + 
            //                     "오늘날짜 : " + criterion); // 값 확인용
            if(collected.plusMonths(map.get(term)).isBefore(criterion.plusDays(1))){
                list.add(i+1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}