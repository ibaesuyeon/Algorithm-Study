import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>(); 
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                } else stack.push(')');
            }
        }
        if (stack.isEmpty())
            return true;
        else return false;
    }
}