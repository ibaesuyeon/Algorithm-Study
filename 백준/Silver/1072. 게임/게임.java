import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());
        long z = y * 100 / x;

        if (z >= 99) {
            System.out.println(-1);
        } else {
            long left = 0;
            long right = 2000000000;

            while (left < right) {
                long mid = (left + right) / 2;

                long ret = 100 * (y + mid) / (x + mid);

                if (ret> z) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            System.out.println(right);
        }
    }
}
