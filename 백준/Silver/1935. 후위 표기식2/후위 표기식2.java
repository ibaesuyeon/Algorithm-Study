import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        ArrayDeque<Double> deque = new ArrayDeque<>();
        double[] arr = new double[n];

        for(int i = 0; i<n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        for(int i = 0; i<str.length(); i++) {
            char c = str.charAt(i);
            double res = 0;
            if(c - 65 >= 0 && c - 65 <= 26 ) {
                deque.push(arr[c - 65]);
            } else {
                double a = deque.pop();
                double b = deque.pop();
                if (c == '+') {
                    res = b+a;
                    deque.push(res);
                } else if (c == '*') {
                    res = b* a;
                    deque.push(res);
                } else if (c == '-') {
                    res = b-a;
                    deque.push(res);
                } else if ( c == '/') {
                    res = b/a;
                    deque.push(res);
                }
            }
        }
        System.out.printf("%.2f", deque.pollLast());
    }
}