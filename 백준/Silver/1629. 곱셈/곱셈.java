import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        System.out.println(calculate(a,b));

    }
    public static long calculate(long a, long b){
        if ( b == 1){
            return a%c;
        }
        long temp = calculate(a, b/2);
        if(b%2 == 1){
            return (temp*temp%c) * a%c;
        }
        return temp * temp % c;
    }
}
