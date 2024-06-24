import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            String command = br.readLine();
            if (command.contains("push")){
                st = new StringTokenizer(command);
                command = st.nextToken();
                q.add(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")){
                if (q.isEmpty())
                    sb.append(-1).append("\n");
                else sb.append(q.poll()).append("\n");
            } else if (command.equals("size")){
                sb.append(q.size()).append("\n");
            } else if (command.equals("empty")){
                if (q.isEmpty())
                    sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (command.equals("front")){
                if (q.isEmpty())
                    sb.append(-1).append("\n");
                else sb.append(q.getFirst()).append("\n");
            } else {
                if (q.isEmpty())
                    sb.append(-1).append("\n");
                else sb.append(q.getLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}