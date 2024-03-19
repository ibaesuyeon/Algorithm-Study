import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n+1];
        dp[0] = 0;  dp[1] = 1;
        for(int i = 2; i<=n; i++){
            dp[i] = -1;
        }
        dp[n] = fibo(n);
        System.out.println(dp[n]);
    }
    public static int fibo(int n){
        if(dp[n] == -1){
            dp[n] = fibo(n-1) + fibo(n-2);
        }
        return dp[n];
    }
}
