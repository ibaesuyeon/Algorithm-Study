import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char[][] candy;
    static int n;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        candy = new char[n][n];
        for(int i = 0; i<n; i++){
            String str = br.readLine();
            for(int j = 0; j<candy[i].length; j++){
                candy[i][j] = str.charAt(j);
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1; j++){
//                if (j != n-1){ //가장 오른 쪽 캔디가 아닐 때
                    // 오른쪽 캔디와 교환
                    char temp = candy[i][j];
                    candy[i][j] = candy[i][j+1];
                    candy[i][j+1] = temp;

                    //갯수 확인
                    count();

                    //원상복구
                    temp = candy[i][j];
                    candy[i][j] = candy[i][j+1];
                    candy[i][j+1] = temp;
//                }
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                char temp = candy[j][i];
                candy[j][i] = candy[j+1][i];
                candy[j+1][i] = temp;

                count();

                temp = candy[j][i];
                candy[j][i] = candy[j+1][i];
                candy[j+1][i] = temp;
            }
        }
        System.out.println(max);
    }

    private static void count() {
        for(int i = 0; i<n; i++){
            int count = 1;
            for(int j = 0; j<n-1; j++){
                if (candy[i][j] == candy[i][j+1])
                    count++; //캔디가 연속되면 ++
                else count=1; //다른색이면 1로 초기화
                max = Math.max(max, count);
            }
        }

        for(int i = 0; i<n; i++){
            int count = 1;
            for(int j = 0; j<n-1; j++){
                if (candy[j][i] == candy[j+1][i])
                    count++;
                else count = 1;
                max = Math.max(max, count);
            }
        }
    }
}