import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<m; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        int res = Integer.MAX_VALUE;

        for(int i = 1; i<=1001; i++){
            if(set.contains(i)) continue;
            for(int j = 1; j<=1001; j++) {
                if(set.contains(j)) continue;
                for(int k = 1; k<=1001; k++){
                    if (set.contains(k)) continue;

                    int x = i * j * k;
                    if (Math.abs(n - x)<res) res = Math.abs(n-x);
                    if (n+1<x)   break;
                }
            }
        }
        System.out.println(res);
    }
}