import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new long[46][2];
        for(int i = 0; i<=n; i++){
            dp[i][0] = -1; dp[i][1] = -1;
        }
        dp[0][0] = 1; dp[0][1] = 0; // A
        dp[1][0] = 0; dp[1][1] = 1; // B
        dp[2][0] = 1; dp[2][1] = 1; // BA
        dp[3][0] = 1; dp[3][1] = 2; // BAB
        dp[4][0] = 2; dp[4][1] = 3; // BABBA
        dp[n] = babba(n);
        System.out.println(dp[n][0] + " " + dp[n][1]);
    }
    public static long[] babba(int n){
        if(dp[n][0] == -1 || dp[n][1] == -1){
            dp[n][0] = babba(n-1)[1];
            dp[n][1] = babba(n-1)[0] + babba(n-1)[1];
        }
        return dp[n];
    }
}
