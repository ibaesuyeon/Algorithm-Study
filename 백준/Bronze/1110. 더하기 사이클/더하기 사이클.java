import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //주어진 수
        int criterion = n;
        int count = 0;
        while (true) {
            n = (n % 10) * 10 + (n % 10 + n / 10) % 10;
            count++;
            if (criterion == n) break;
        }
        System.out.println(count);
    }
}