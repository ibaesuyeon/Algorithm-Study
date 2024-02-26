import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        double res = 0.0;
        double p = combination(n,m);

        while(m >= k){
            if(n-m<m-k) {
                k++;
                continue;
            }
            double c = combination(m,k) * combination(n-m, m-k);

            res += c/p;
            k++;
        }
        System.out.println(res);
    }
    public static double combination(int n, int m){
        int p = 1; int c = 1;
        while(m > 0) {
            c *=(n--);
            p *=(m--);
        }
        return c/p;
    }
}
