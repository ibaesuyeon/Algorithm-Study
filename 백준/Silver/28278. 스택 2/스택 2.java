import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++) {
            int command = sc.nextInt();
            switch(command) {
                case (1) :
                    stack.push(sc.nextInt()); break;
                case (2) :
                    if (stack.isEmpty())
                        sb.append(-1).append("\n");
                    else sb.append(stack.pop()).append("\n");
                    break;
                case (3) :
                    sb.append(stack.size()).append("\n");
                    break;
                case (4) :
                    if (stack.isEmpty())
                        sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case (5) :
                    if (stack.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(stack.peek()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}