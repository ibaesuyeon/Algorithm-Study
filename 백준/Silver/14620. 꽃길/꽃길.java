import java.io.*;
import java.util.*;
public class Main {
    static int[][] arr;
    static int n;
    static int min = Integer.MAX_VALUE;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        visited = new boolean[n+1][n+1];

        for(int i=1; i<=n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0,0);
        System.out.println(min);
    }
    public static void dfs(int seeds,  int sum) {
        if(seeds ==3) {
            min =Math.min(min, sum);
            return;
        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(isPossible(i,j)) {
                    int temp = get_sum(i,j);
                    set_visit(i,j,true);
                    dfs(seeds+1,sum+temp);
                    set_visit(i,j,false);
                }
            }
        }

    }
    public static int get_sum(int x, int y) {
        int sum = arr[x][y];
        for(int i=0; i<4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            sum+= arr[nx][ny];
        }
        return sum;
    }
    public static void set_visit(int x, int y, boolean v) {
        if(v) {
            visited[x][y] =true;
            for(int i=0; i<4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                visited[nx][ny] = true;
            }
        }
        else {
            visited[x][y]= false;
            for(int i=0; i<4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                visited[nx][ny]= false;
            }
        }
    }
    public static boolean isPossible(int x, int y) {
        if(visited[x][y]) {
            return false;
        }
        for(int i=0; i<4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(!isRange(nx,ny)) {
                return false;
            }
            if(visited[nx][ny]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isRange(int x, int y) {
        if(x>=1 && y>=1 && x<=n && y<=n) {
            return true;
        }
        return false;
    }
}