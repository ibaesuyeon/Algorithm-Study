import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int m;
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        visit = new boolean[n];

        dfs(0);
        System.out.println(sb);

    }
    public static void dfs(int depth) {
        if (depth == m){ //재귀의 깊이가 M과 같아지면 탐색하면서 담았던 배열을 출력
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i<n; i++)   {
            //방문하지 않은 노드라면
            if (!visit[i]) {
                visit[i] = true; //방문 상태로 변경
                arr[depth] = i+1; //해당 깊이를 인덱스로 해서 i+1 저장
                dfs(depth+1); // 다음 자식 노드 방문을 위해 depth 1 증가시키면서 재귀 호출
                visit[i] = false; // 자식 노드 방문이 끝나고 돌아와서 방문노드를 방문하지 않은 상태로 변경
            }
        }
    }
}