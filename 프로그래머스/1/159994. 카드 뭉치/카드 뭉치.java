import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Stack<String> stack1 = new Stack<>();
        for(int i = cards1.length-1; i>=0; i--){
            stack1.add(cards1[i]);
        }
        Stack<String> stack2 = new Stack<>();
        for(int i = cards2.length-1; i>=0; i--){
            stack2.add(cards2[i]);
        }
         for(int i = 0; i<goal.length; i++){
             if(!stack1.isEmpty() && stack1.peek().equals(goal[i])){
                 stack1.pop();
             } else if(!stack2.isEmpty() && stack2.peek().equals(goal[i])){
                 stack2.pop();
             } else {
                 answer = "No";
             }
         }
        
        return answer;
    }
}