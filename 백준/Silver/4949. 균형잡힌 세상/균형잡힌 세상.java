import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String text;
        while(true){
            text = br.readLine();
            if(text.equals(".")) break;
            sb.append(balance(text)).append("\n");
        }
        System.out.println(sb);
    }
    public static String balance(String text){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<text.length(); i++){
            char c = text.charAt(i);

            if(c == '(' || c == '['){
                stack.push(c);
            } else if (c == ')'){
                if(stack.empty() || stack.peek()!='('){
                    return "no";
                } else stack.pop();
            } else if (c == ']'){
                if(stack.empty() || stack.peek()!='['){
                    return "no";
                } else stack.pop();
            }
        }
        if(stack.empty())
            return "yes";
        else return "no";
    }
}