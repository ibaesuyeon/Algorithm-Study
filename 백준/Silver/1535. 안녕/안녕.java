import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] energy = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<n+1; i++) {
            energy[i] = Integer.parseInt(st.nextToken());
        }

        int[] pleasure = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<n+1; i++) {
            pleasure[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[101]; //최대 기쁨
        for(int i=1; i<n+1; i++) {
            for(int j=99; j>=0; j--) {
                int temp = energy[i]+j;
                if(temp<100) {
                    dp[temp] = Math.max(dp[temp], dp[j]+pleasure[i]);
                }
            }
        }
        System.out.println(dp[99]);
    }
}
