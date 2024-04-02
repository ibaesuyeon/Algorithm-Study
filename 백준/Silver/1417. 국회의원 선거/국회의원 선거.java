import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int min = 0;
        if (n != 1){
            for (int i = 0; i < n-1; i++) {
                queue.add(Integer.parseInt(br.readLine()));
            }
            while (queue.peek() >= m){
                int top = queue.poll();
                top--;
                m++;
                min ++;
                queue.add(top);
            }
        }
        System.out.println(min);
    }
}