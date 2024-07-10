import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
        String E = st.nextToken();
        String Q = st.nextToken();
        int res =0;
        HashSet<String> start = new HashSet<>();
        HashSet<String> end = new HashSet<>();
        String temp;
        while((temp=br.readLine())!=null) {
            if(S.compareTo(temp.split(" ")[0])>=0) {
                start.add(temp.split(" ")[1]);
            }else if(E.compareTo(temp.split(" ")[0])<=0 && Q.compareTo(temp.split(" ")[0])>=0 ) {
                end.add(temp.split(" ")[1]);
            }
        }
        for (String tmp : end) {
            if(start.contains(tmp)) {
                res++;
            }
        }
        System.out.println(res);
    }
}