import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String command="";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            command = st.nextToken();
            if(command.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")){
                if(stack.empty())
                    sb.append("-1").append("\n");
                else
                    sb.append(stack.pop()).append("\n");
            } else if (command.equals("size")){
                sb.append(stack.size()).append("\n");
            } else if (command.equals("empty")){
                if(stack.empty())
                    sb.append("1").append("\n");
                else sb.append("0").append("\n");
            } else if (command.equals("top")){
                if(stack.empty())
                    sb.append("-1").append("\n");
                else
                    sb.append(stack.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }
}