import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(stk.nextToken());
        for(int i = 0 ; i<t; i++){
            int n = Integer.parseInt(br.readLine());

            String str = br.readLine();
            int[] start = new int[n+1];
            String[] tokens = str.split(" ");
            for(int j = 0; j < n; j++){
                start[j+1] = Integer.parseInt(tokens[j]);
            }
            int line = 0;
            for(int j = 1; j<=n; j++){
                int destination = j;
                for( destination = j; destination <= n; destination++){
                    if(j == start[destination]) break;
                }
                int st = start[destination];
                int diff = destination-st;
                while(diff>0){
                    int temp = start[destination];
                    start[destination] = start[destination-1];
                    start[destination-1] = temp;
                    destination--;
                    diff--;
                    line++;
                }
            }
            System.out.println(line);

        }

    }
}
