import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for(int j = 0; j<n; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                if(Math.pow((x-startX), 2) + Math.pow((y-startY), 2) < Math.pow(r, 2)&& Math.pow((x-endX), 2) + Math.pow((y-endY), 2) > Math.pow(r, 2)) {
                    count++;
                }
                if(Math.pow((x-startX), 2) + Math.pow((y-startY), 2) > Math.pow(r, 2)&& Math.pow((x-endX), 2) + Math.pow((y-endY), 2) < Math.pow(r, 2)) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}