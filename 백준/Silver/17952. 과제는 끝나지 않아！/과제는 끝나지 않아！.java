import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Homework> stack = new Stack<>();
        StringTokenizer st;
        int total_score = 0;

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            if (st.nextToken().equals("1")){
                int score = Integer.parseInt(st.nextToken());
                int time = Integer.parseInt(st.nextToken());
                if (time == 1){
                    total_score+=score;
                } else
                    stack.push(new Homework(score, time-1));
            } else if (!stack.isEmpty()) {
                Homework hw = stack.pop();
                hw.time--;
                if (hw.time == 0){
                    total_score+=hw.score;
                } else stack.push(hw);
            }
        }
        System.out.println(total_score);
    }
    public static class Homework {
        int score;
        int time;
        public Homework(int score, int time){
            this.score = score;
            this.time = time;
        }
    }
}
