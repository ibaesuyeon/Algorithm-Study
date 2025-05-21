import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[] sumArr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        sumArr[0] = 0;
        for(int i = 1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sumArr[i] = sumArr[i-1] + arr[i];
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int res = sumArr[end] - sumArr[start-1];
            sb.append(res).append("\n");
        }
        System.out.println(sb);
    }
}