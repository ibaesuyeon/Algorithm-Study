import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] dp = new int[1000001];
        dp[1] = 1; dp[2] = 2; dp[3] = 4; dp[4] = 7;

        for(int i = 0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            for(int j = 5; j<=n; j++){
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }
            System.out.println(dp[n]);
        }

    }
}