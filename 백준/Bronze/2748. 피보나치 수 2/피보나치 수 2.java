import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new long[91];
        for(int i = 0; i<91; i++){
            dp[i] = -1;
        }
        dp[0] = 0; dp[1] = 1; dp[2] = 1;
        dp[n] = fibo(n);
        System.out.println(dp[n]);

    }
    public static long fibo(int n){
        if(dp[n] == -1)
            dp[n] = fibo(n-1) + fibo(n-2);
        return dp[n];
    }
}