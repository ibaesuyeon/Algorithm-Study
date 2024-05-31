import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int n,m;
    static boolean[] visited;
    static int[] res;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        res = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.println(sb);
    }
    public static void dfs(int depth){
        if(depth == m) {
            for(int i = 0; i<m; i++){
                sb.append(res[i]).append(" ");
            }
            sb.append("\n");
        }
        for (int i = 0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                res[depth] = arr[i];
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}