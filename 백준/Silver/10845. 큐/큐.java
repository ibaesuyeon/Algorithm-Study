import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int last = 0;
        for(int i = 0; i<n; i++){
            String command = br.readLine();
            if(command.contains("push")){
                StringTokenizer st = new StringTokenizer(command);
                command = st.nextToken();
                int x = Integer.parseInt(st.nextToken());
                q.offer(x);
                last = x;
            } else if(command.equals("pop")){
                Integer x = q.poll();
                if (x == null)
                    System.out.println(-1);
                else System.out.println(x);
            } else if(command.equals("size")) {
                System.out.println(q.size());
            } else if(command.equals("empty")){
                if(q.isEmpty()) {
                    System.out.println(1);
                } else System.out.println(0);
            } else if (command.equals("front")) {
                Integer x = q.peek();
                if (x == null){
                    System.out.println(-1);
                }else {
                    System.out.println(x);
                }
            } else if (command.equals("back")){
                if(q.isEmpty())
                    System.out.println(-1);
                else System.out.println(last);
            }
        }
    }
}