import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<1000; i++){
            for(int j = 0; j<=i; j++) {
                arr.add(i+1);
            }
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int sum = 0;
        for(int i = n-1; i<=m-1; i++) {
            sum += arr.get(i);
        }
        System.out.println(sum);
    }
}