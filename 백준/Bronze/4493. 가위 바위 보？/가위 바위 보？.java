import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int score_p1;
    public static int score_p2;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i<t; i++){
            score_p1 = 0;
            score_p2 = 0; //초기화
            int n = Integer.parseInt(br.readLine());
            for(int j = 0; j<n; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String p1 = st.nextToken();
                String p2 = st.nextToken();
                rsp(p1, p2);
            }
            if(score_p1>score_p2)
                sb.append("Player 1").append("\n");
            else if(score_p1 == score_p2)
                sb.append("TIE").append("\n");
            else sb.append("Player 2").append("\n");
        }
        System.out.println(sb);
    }
    public static void rsp(String p1, String p2) {
        if (p1.equals("R")) {
            if (p2.equals("S"))
                score_p1++;
            else if (p2.equals("P"))
                score_p2++;
        } else if (p1.equals("S")) {
            if (p2.equals("R"))
                score_p2++;
            else if (p2.equals("P"))
                score_p1++;
        } else if (p1.equals("P")) {
            if (p2.equals("R"))
                score_p1++;
            else if (p2.equals("S"))
                score_p2++;
        }
    }

}