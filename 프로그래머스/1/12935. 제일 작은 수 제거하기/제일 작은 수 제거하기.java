import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : arr){
            list.add(a);
        }
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        list.remove(index);
        if(list.isEmpty()){
            int[] answer = {-1};
            return answer;
        } else{
            int[] answer = new int[list.size()];
            for(int i = 0; i<list.size(); i++){
                answer[i] = list.get(i);
            }                     
            return answer;
        }
    }
}