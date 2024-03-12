import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String L = st.nextToken();
        String R = st.nextToken();
        if (L.length() == R.length()){
            min = num8(L,R);
        } else{
            min = 0;
        }
        System.out.println(min);
    }
    public static int num8(String L, String R){
        int count = 0;
        for (int i = 0; i < L.length(); i++) {
            if (L.charAt(i) == R.charAt(i)) {
                if (L.charAt(i) == '8') {
                    count++;
                }
            } else {
                break;
            }
        }
        return count;
    }
}
