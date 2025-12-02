import java.util.*;
class Solution{
    public int solution(String s){
        int answer = 0;
        String[] ss = s.split("");
        Stack<String> stack = new Stack<>();
        
        for(int i = 0; i<ss.length; i++){
            stack.push(ss[i]);
            
            if(!stack.isEmpty() && stack.size()>=2){
                String p1 = stack.pop();
                String p2 = stack.pop();
                if(!p1.equals(p2)){
                    stack.push(p2);
                    stack.push(p1);
                }
            }
        }
        if(stack.isEmpty()){
            answer = 1;
        }
        return answer;
    }
}