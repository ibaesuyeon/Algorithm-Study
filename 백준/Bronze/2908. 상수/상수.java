import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        int reversed_a = ((a.charAt(2)-'0')*100) + ((a.charAt(1)-'0')*10) + a.charAt(0)-'0';
        int reversed_b = ((b.charAt(2)-'0')*100) + ((b.charAt(1)-'0')*10) + b.charAt(0)-'0';
        System.out.println(Math.max(reversed_a, reversed_b));
    }
}
