import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int win = Integer.parseInt(st.nextToken());
        int lose = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<p; i++){
            st = new StringTokenizer(br.readLine());
            String P = st.nextToken();

            if (st.nextToken().equals("W"))
                map.put(P, win);
            else map.put(P, -lose);
        }
        int score = 0;
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();

            if (!map.containsKey(name) || map.get(name) <0) {
                if (!map.containsKey(name) || map.get(name) < 0) {
                    score -= lose;
                    if (score < 0) {
                        score = 0;
                    }
                }
                continue;
            }
            score += map.get(name);
            if (score >= total) {
                System.out.println("I AM NOT IRONMAN!!"); return;
            }
        }
        System.out.println("I AM IRONMAN!!");
    }
}