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
        char[][] planks = new char[n][m];
        int sum = 0;
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            planks[i] = str.toCharArray();
        }

        for(int i = 0; i <n; i++){
            for(int j = 0; j<m; j++){
                if(planks[i][j] == '-'){
                    if(j == m-1 || planks[i][j+1] == '|'){
                        sum ++;
                    }
                }
                if(planks[i][j] == '|'){
                    if(i == n-1 || planks[i+1][j] == '-' ){
                        sum ++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
