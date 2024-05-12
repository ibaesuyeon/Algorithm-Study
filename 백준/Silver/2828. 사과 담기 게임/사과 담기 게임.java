import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int apple = Integer.parseInt(br.readLine());

        int left = 1;
        int right = m;
        int sum = 0;

        for(int i = 0; i<apple; i++) {
            int fall = Integer.parseInt(br.readLine());

            if(left<=fall && right>=fall){
                continue;
            }
            if(left > fall) {
                sum += (left - fall);
                right -= (left - fall);
                left = fall;
            }
            else {
                sum += (fall - right);
                left += (fall -right);
                right = fall;
            }
        }
        System.out.println(sum);
    }
}