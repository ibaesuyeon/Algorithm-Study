import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        long[] dp = new long[1000001];
        for(int i = 0 ; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            dp[1] = 1; dp[2] = 2; dp[3] = 4;
            for(int j = 4; j<=n; j++){
                dp[j] = (dp[j-1] + dp[j-2] + dp[j-3]) % 1000000009;
            }
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb);
    }
}