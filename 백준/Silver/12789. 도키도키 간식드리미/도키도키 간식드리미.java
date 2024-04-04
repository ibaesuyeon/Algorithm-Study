import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            stack2.add(Integer.parseInt(st.nextToken()));
        }
        for(int i = 0; i<n; i++){
            stack1.add(stack2.pop());
        }
        int i = 1;
        while (i<=n) {
            if(!stack1.isEmpty() && stack1.peek() == i){
                stack1.pop();
                i++;
            } else if (!stack2.isEmpty() && stack2.peek() == i){
                stack2.pop();
                i++;
            } else if(!stack1.isEmpty() && stack1.peek()!= i)
                stack2.add(stack1.pop());
            else break;
        }
        if(i > n)
            System.out.println("Nice");
        else System.out.println("Sad");
    }
}