import java.io.IOException;
import java.util.*;

class Solution {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int tc = 1; tc<=T; tc++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][n];
            int[][] dead = new int[n-m+1][n-m+1];
            for(int j = 0; j<n; j++){
                for(int k = 0; k<n; k++){
                    arr[j][k] = sc.nextInt();
                }
            }
            for(int j = 0; j<n-m+1; j++){
                for(int k = 0; k<n-m+1; k++){
                    for(int a = 0; a<m; a++){
                        for(int b = 0; b<m; b++){
                            dead[j][k] += arr[j+a][k+b];
                        }
                    }
                }
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i<n-m+1; i++){
                for(int j = 0; j<n-m+1; j++){
                    list.add(dead[i][j]);
                }
            }
            sb.append("#").append(tc).append(" ").append(Collections.max(list)).append("\n");
        }
        System.out.println(sb);
    }
}