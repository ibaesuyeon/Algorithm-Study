import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println(1);
            System.exit(0);
        }
        for(int i = 1; i<=n; i++){
            q.add(i);
        }
        while(q.peek() != null){
            q.poll();
            q.add(q.poll());
            if(q.size() == 1)
                break;
        }
        System.out.println(q.peek());
    }
}