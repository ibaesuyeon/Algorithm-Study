import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            if (c == '#') break;
            String str = st.nextToken("").toLowerCase();
            int count = 0;
            for(int i = 0; i<str.length(); i++){
                if (c == str.charAt(i))
                    count++;
            }
            sb.append(c).append(" ").append(count).append("\n");
        }
        System.out.println(sb);
    }
}