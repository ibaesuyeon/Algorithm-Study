import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int t;
    static int docNum;
    static int target;
    static Queue<Integer> priorQ;
    static Queue<Integer> indexQ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i = 0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            docNum = Integer.parseInt(st.nextToken());
            target = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            priorQ = new LinkedList<>();
            indexQ = new LinkedList<>();
            for(int j = 0; j <docNum; j++){
                priorQ.offer(Integer.parseInt(st.nextToken()));
                indexQ.offer(j);
            }
            print();
        }
    }
    public static void print(){
        int cnt = 1;

        while(!priorQ.isEmpty()) {
            int max = Collections.max(priorQ);
            int cur = priorQ.poll();
            int curIdx = indexQ.poll();

            if(cur == max) {
                if(curIdx == target ) {
                    System.out.println(cnt);
                    break;
                }
                cnt++;
            } else {
                priorQ.offer(cur);
                indexQ.offer(curIdx);
            }
        }
    }
}