import java.util.Scanner;

public class Main {
    static Integer[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp = new Integer[n+1];
        dp[0] = 0; dp[1] = 0;

        System.out.println(func(n));
    }
    public static int func(int n){
        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(func(n/3), Math.min(func(n/2), func(n-1))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(func(n/3), func(n-1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(func(n/2), func(n-1)) + 1;
            } else {
                dp[n] = func(n-1) + 1;
            }
        }
        return dp[n];
    }
}