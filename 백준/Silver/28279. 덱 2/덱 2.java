import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            if (command.equals("1")){
                q.addFirst(num);
            } else if (command.equals("2")){
                q.addLast(num);
            } else if (command.equals("3")){
                if (q.isEmpty())
                    sb.append(-1).append("\n");
                else sb.append(q.removeFirst()).append("\n");
            } else if (command.equals("4")){
                if (q.isEmpty())
                    sb.append(-1).append("\n");
                else sb.append(q.removeLast()).append("\n");
            } else if (command.equals("5")){
                sb.append(q.size()).append("\n");
            } else if (command.equals("6")){
                if (q.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (command.equals("7")){
                if (q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(q.peekFirst()).append("\n");
            } else {
                if (q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(q.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}