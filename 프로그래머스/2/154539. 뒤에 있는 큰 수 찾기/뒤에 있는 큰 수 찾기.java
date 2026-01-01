import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        
        stack.add(0);
        int idx = 1;
        while(idx < numbers.length){
            if(numbers[idx] <= numbers[stack.peek()]){
                stack.add(idx);
                idx++;
            } else{
                int target = stack.pop();
                answer[target] = numbers[idx];
                if(stack.isEmpty()){
                    stack.add(idx);
                    idx++;
                }
            }
        }
        while(!stack.isEmpty()){
            idx = stack.pop();
            answer[idx] = -1;
        }
        return answer;
    }
}