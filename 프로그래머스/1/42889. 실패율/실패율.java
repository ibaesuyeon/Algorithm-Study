import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 1; i<=N; i++){
            map.put(i, 0);
        }
        
        for(int i = 0; i<stages.length; i++){
            int stage = stages[i];
            if(stage<=N)
                map.put(stage, map.get(stage)+1); // stage에 머무르고 있는 사람 수
        }
        
        HashMap<Integer, Float> fail = new HashMap<>();
        float total = stages.length;
        // 실패율 구해서 stage별로 fail맵에 저장
        for(int i = 1; i<=N; i++){
            if(map.get(i) != 0){
                fail.put(i, map.get(i)/total);         
                total = total - map.get(i);
            } else {
                fail.put(i, (float)0);
            }
        }
        // 내림차순 정렬
        List<Map.Entry<Integer, Float>> entryList = new LinkedList<>(fail.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for (int i = 0; i < entryList.size(); i++) {
            answer[i] = entryList.get(i).getKey();
        }
        return answer;
    }
}