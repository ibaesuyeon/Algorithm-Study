import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, arr[i][j]);
                max = Math.max(max, arr[i][j]);
            }
        }
        int res = Integer.MAX_VALUE;
        int high = -1;
        for (int i = min; i<=max; i++){
            int time = 0;
            int blocks = b;
            for(int j = 0; j< n; j++) {
                for (int k = 0; k<m; k++){
                    int diff = arr[j][k] - i;
                    if (diff > 0) {
                        time += Math.abs(diff) * 2;
                        blocks += Math.abs(diff);
                    } else if (diff < 0) {
                        time += Math.abs(diff);
                        blocks -= Math.abs(diff);
                    }
                }
            }
            if (blocks >= 0) {
                if (time <= res){
                    res = time;
                    high = i;
                }
            }
        }
        System.out.println(res + " " + high);

    }
}