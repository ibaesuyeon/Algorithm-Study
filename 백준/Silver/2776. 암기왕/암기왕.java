import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i< t; i++){
            int n = Integer.parseInt(br.readLine());
            Set<Integer> set = new HashSet<>();

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                set.add(Integer.parseInt(st.nextToken()));
            }
            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int k = 0; k<m; k++){
                int res = Integer.parseInt(st.nextToken());
                if(set.contains(res)){
                    sb.append(1);
                    sb.append("\n");
                }else{
                    sb.append(0);
                    sb.append("\n");
                }
            }
            set.clear();
        }
        System.out.println(sb);
    }
}
