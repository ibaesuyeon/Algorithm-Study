import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 0;
        int count = 0;
        while(true){
            i++;
            String s = String.valueOf(i);
            if(s.contains("666")){
                count++;
            }
            if(count == n){
                break;
            }
        }
        System.out.println(i);
    }
}