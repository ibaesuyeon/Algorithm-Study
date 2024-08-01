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
        boolean[][] arr = new boolean[n+1][n+1];
        for (int i = 0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = true; arr[b][a] = true;
        }
        int res = 0;
        for (int i = 1; i<=n; i++){
            for (int j = i+1; j<=n; j ++){
                for (int k = j+1; k<=n; k++) {
                    if (arr[i][j] || arr[j][k] || arr[k][i])
                        continue;
                    res++; //all false -> res++
                }
            }
        }
        System.out.println(res);
    }
}