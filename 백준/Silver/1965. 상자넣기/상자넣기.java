import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[1001];
        int[] dp = new int[1001];
        int res = 0;

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            dp[i] = 1;
            for(int j = 0; j<i; j++){
                if(arr[j] < arr[i])
                    dp[i] = Math.max(dp[i], dp[j]+1);
            }
            res = Math.max(res, dp[i]);
        }
        System.out.println(res);
    }
}
