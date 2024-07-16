import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            Stack<Character> stack = new Stack<>();

            String[] str = br.readLine().split("");
            for (int j = 0; j<str.length; j++){
                if (str[j].equals("(")){
                    stack.push('(');
                } else if (str[j].equals(")")){
                    if (stack.isEmpty()) {
                        stack.push(')');
                        break;
                    }
                    else stack.pop();
                } else continue;
            }
            if (stack.isEmpty())
                sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
}