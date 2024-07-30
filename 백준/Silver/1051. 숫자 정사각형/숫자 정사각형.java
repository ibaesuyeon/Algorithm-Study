import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        for(int i = 0; i<n; i++){
            String str = br.readLine();
            for (int j = 0; j<m; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        int res = 1;
        for (int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                for(int k = 1; i+k<n && j+k<m; k++){
                    if (arr[i][j] == arr[i+k][j]
                    && arr[i][j] == arr[i][j+k]
                    && arr[i][j] == arr[i+k][j+k]){
                        res = Math.max(res, (k+1) * (k+1));
                    }
                }
            }
        }
        System.out.println(res);
    }
}