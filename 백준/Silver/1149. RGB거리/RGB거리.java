import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int R = 0, G = 1, B = 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n][3];

        for (int i = 0; i<n; i++){
            for (int j = 0; j<3; j++){
                dp[i][j] = sc.nextInt();
            }
        }
        for(int i = 1; i<n; i++){
            dp[i][R] += Math.min(dp[i-1][G], dp[i-1][B]);
            dp[i][G] += Math.min(dp[i-1][R], dp[i-1][B]);
            dp[i][B] += Math.min(dp[i-1][G], dp[i-1][R]);
        }
        System.out.println(Math.min(dp[n-1][R], Math.min(dp[n-1][G], dp[n-1][B])));
    }
}
